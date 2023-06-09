import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Student s=ctx.getBean("s",Student.class);
        Student s2=ctx.getBean("s2",Student.class);
        System.out.println(s);
        System.out.println(s2);
    }
}
