import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public  static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        user.show();
    }
}
