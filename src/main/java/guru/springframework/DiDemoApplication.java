package guru.springframework;

import guru.springframework.controllers.Field;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.getterC;
import guru.springframework.controllers.setterC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {
//ctrl+i to implemet the interface methods
//alt +enter to organize imports and many more
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyController controller = (MyController) ctx.getBean("myController");
//
//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());


		getterC getc= (getterC) ctx.getBean("getterC");
		getc.printff();


		setterC setterC = (setterC) ctx.getBean("setterC");
		setterC.disp();
		Field field=(Field)ctx.getBean("field");
		field.disp();

		MyController mc=(MyController)ctx.getBean("myController");
		mc.disp();
	}
}
