package club.sulinxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
  ** desc  来标注一个主程序类，说明这是一个Spring boot 应用
 **/
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //启动springApplication
        SpringApplication.run(MainApplication.class,args);

    }
}
