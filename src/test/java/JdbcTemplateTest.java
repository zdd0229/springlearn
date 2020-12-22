import com.z.spring.config.SpringConfig;
import com.z.spring.dao.CustomerDao;
import com.z.spring.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class JdbcTemplateTest {

    @Autowired
    CustomerDao customerDao;

    @Test
    public void test1(){

        Integer insert = customerDao.insert(new Customer());
        System.out.println(insert);

    }

    @Test
    public void test2(){

        Integer insert = customerDao.update();
        System.out.println(insert);

    }

    @Test
    public void test3(){

        Integer insert = customerDao.delete();
        System.out.println(insert);

    }

    @Test
    public void test4(){

        Integer count = customerDao.count();
        System.out.println(count);

    }

    @Test
    public void test5(){

        Customer customer = customerDao.selectOne();
        System.out.println(customer);

    }

    @Test
    public void test6(){

        List<Customer> customers = customerDao.selectList();
        System.out.println(customers);

    }

    @Test
    public void test7(){

        int[] ints = customerDao.batchAdd();
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void test8(){

        int[] ints = customerDao.batchUpdate();
        System.out.println(Arrays.toString(ints));

    }

    @Test
    public void test9(){

        int[] ints = customerDao.batchDelete();
        System.out.println(Arrays.toString(ints));

    }

}
