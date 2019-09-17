package club.sulinxx.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
//@ConfigurationProperties(prefix = "person")
public class Person {
    /**
     *      <bean class="person">
     *       <property name="name" value="字面量/${从环境变量、配置文件中获取值}/#{SpEl，也就是spring的表达式语言}"
     *      </bean>
     *
     *
     *      两种注入方式：(二者不要同时用)
     *      ①@ConfigurationProperties+@Component和配置文件(properties+yml文件)
     *      ②单独使用@value注解注入
     *
     *      区别：  第一种批量注入                        后者逐个注入
     *              第一种支持松散绑定(大小写不敏感)      后者大小写铭感               （松散绑定）
     *              第一种不支持spEL                      后者支持spEL
     *              第一种支持JSR303数据校验              后者不支持              "@validate修饰类，@Email等修饰字段"
     *
     *              重点@value注解在一些复杂类型的封装时候，不支持(例如map)
     *              如果只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@value
     *              如果是在大批量中需要获取配置文件资源使用@ConfigurationProperties
     **/
    @Value("${person.name}")
    private String name;

    @Value("#{11*2}")
    private Integer age;

    @Value("true")
    private Boolean boss;

    private Date birth;

    private Map<String,Object>maps;
    private List<Object>lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
