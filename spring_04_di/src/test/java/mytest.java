
import com.kuang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public  static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)  context.getBean("student");
        System.out.println(student.toString());
    }
}