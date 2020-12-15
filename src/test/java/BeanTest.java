import com.z.spring.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student) applicationContext.getBean("student");

        System.out.println("获取实例");

        System.out.println(student.getName());

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
