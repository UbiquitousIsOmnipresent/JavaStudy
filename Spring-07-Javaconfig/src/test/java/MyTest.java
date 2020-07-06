import com.kuang.pojo.User;
import com.kuang.pojo.ZhouConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ZhouConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.toString());

    }
}
