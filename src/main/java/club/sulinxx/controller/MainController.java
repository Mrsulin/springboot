package club.sulinxx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.expression.Maps;

import java.util.HashMap;
import java.util.Map;


@Controller
public class MainController {
    private static final Logger logger= LoggerFactory.getLogger(MainController.class);

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!";
    }

    @RequestMapping("/a")
    public String a(){
        return "a";
    }

    @ResponseBody
    @PostMapping("/json")
    public Map<String,Object>json(@RequestParam("key")String key){
        logger.info("日志打印数据:"+key);
        Map<String,Object>map=new HashMap<>();

        Map<String,Object>maps1=new HashMap<>();
        maps1.put("head","h1");
        maps1.put("title","百度");
        maps1.put("describe","搜索1");

        Map<String,Object>maps2=new HashMap<>();
        maps2.put("head","h2");
        maps2.put("title","谷歌");
        maps2.put("describe","搜索2");

        Map<String,Object>maps3=new HashMap<>();
        maps3.put("head","h3");
        maps3.put("title","搜狗");
        maps3.put("describe","搜索3");

        map.put("A物件",maps1);
        map.put("B物件",maps2);
        map.put("C物件",maps3);

        return map;


    }

}
