import com.alibaba.druid.pool.DruidDataSource;
import com.z.spring.config.SpringConfig;
import com.z.spring.domain.Order;
import com.z.spring.service.TestSpringService;
import com.z.spring.utils.SqlResultToBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

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

    @Test
    public void test3() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("dataSource");

        Connection connection = dataSource.getConnection();

        PreparedStatement statement = connection.prepareStatement("select * from orders");
        ResultSet resultSet = statement.executeQuery();

        List<Order> res = SqlResultToBean.coverte(resultSet,Order.class);

        res.forEach(System.out::println);
    }
}
