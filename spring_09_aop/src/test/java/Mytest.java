import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
        public static void main(String[] args) {
            ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
            UserService userService = (UserService)context.getBean("userService");
            userService.add();
        }
}
