import com.zhou2.mapper.UserMapper;
import com.zhou2.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySpringBatisTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = (UserMapper) context.getBean("user");
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

    }
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper user = (UserMapper) context.getBean("user");
        user.deleteUser(9);
    }
}
