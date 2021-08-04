import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student bean = context.getBean(Student.class);
		System.out.println(bean);
		System.out.println(123);
	}
}
