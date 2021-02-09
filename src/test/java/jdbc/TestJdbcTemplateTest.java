package jdbc;

import com.ssm.aspectj.Model.User;
import com.ssm.aspectj.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcTemplateTest {
    ApplicationContext applicationContext =null;
    UserDao userDao =null;

    @Before
    public void init(){
        this.applicationContext =  new ClassPathXmlApplicationContext("applicationContext3.xml");
        this.userDao = (UserDao) applicationContext.getBean("userDao");
    }

    @Test
    public void addUserTest(){
        User user = new User();
        user.setUsername("yueguangMan-One");
        user.setPassword("123456");
        int num = userDao.addUser(user);
        if (num>0){
            System.out.println("成功插入了"+num+"条记录");
        }else {
            System.out.println("插入失败"+user);
        }
    }


    @Test
    public void findUserByIdTest(){
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
