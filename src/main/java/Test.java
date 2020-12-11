import com.z.spring.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student video=(Student) applicationContext.getBean("student");
        System.out.println(video.getName());

    }
}
