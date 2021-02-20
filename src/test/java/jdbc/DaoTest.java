package jdbc;


import com.ssm.aspectj.Model.User;
import com.ssm.aspectj.UserDao;
import com.ssm.aspectj.controller.Profile;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void findUserByIdDaoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
        User user2 = userDao.findUserById(1);
        System.out.println(user2);

      /*  Profile profile = (Profile) applicationContext.getBean("profile");
        profile.printAge();
        profile.printName();*/

    }
}
