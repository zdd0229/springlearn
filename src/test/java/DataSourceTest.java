import com.alibaba.druid.pool.DruidDataSource;
import com.z.spring.domain.Order;
import com.z.spring.utils.SqlResultToBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DataSourceTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("druidDataSource");

//        Map<String,String> config = new HashMap<>();
//        config.put("driverClassName","com.mysql.jdbc.Driver");
//        config.put("url","jdbc:mysql://localhost:3306/sql?useUnicode=true&characterEncoding=utf8");
//        config.put("username","root");
//        config.put("password","root");
//
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(config);

        Connection connection = dataSource.getConnection();

        PreparedStatement statement = connection.prepareStatement("select * from orders");
        ResultSet resultSet = statement.executeQuery();

        List<Order> res = SqlResultToBean.coverte(resultSet,Order.class);

        res.forEach(System.out::println);
    }

}
