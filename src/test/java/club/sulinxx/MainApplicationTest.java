package club.sulinxx;

import club.sulinxx.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * 可以在测试期间实现自定注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTest {
    @Autowired
    Person person;
    @Test
    public void tesemethod1(){

        System.out.println(person);

    }

}
