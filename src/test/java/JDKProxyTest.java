import com.z.spring.dao.TestSpringDao;
import com.z.spring.dao.proxy.TestSpringDaoProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {

    @Test
    public void test() {

        TestSpringDao TestSpringDao = new TestSpringDaoProxy();

        TestSpringDao proxyInstance = (TestSpringDao)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{TestSpringDao.class}, new InvocationHandler() {

            private Object o;

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(String.format("params：%s,%s",args[0],args[1]));
                System.out.println(String.format("add方法调用"));
                int res = (int) method.invoke(o,args);
                System.out.println(String.format("return：%s",res));

                return res;
            }

            public InvocationHandler setO(Object o) {
                this.o = o;
                return this;
            }
        }.setO(TestSpringDao));

        proxyInstance.add(1,1);
    }
}
