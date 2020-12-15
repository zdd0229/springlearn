import com.z.spring.config.SpringConfig;
import com.z.spring.service.TestSpringService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestSpringService testSpringService = (TestSpringService) applicationContext.getBean("testSpringService");

        testSpringService.add();
    }
    @Test
    public void test2(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestSpringService testSpringService = (TestSpringService) applicationContext.getBean("testSpringService");

        testSpringService.add();

    }
}
