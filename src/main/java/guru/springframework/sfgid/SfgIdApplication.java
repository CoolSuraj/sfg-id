package guru.springframework.sfgid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgid.controllers.MyController;

@SpringBootApplication
public class SfgIdApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgIdApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		//asked framework to get us object
		
		String greeting = myController.sayHello();
		//Dependency Injection can be donw with Concrete Classes or with Interfaces(it is preferred)
		//Inversion Of Control (IOC) allows dependecies to be injected at runtime
		
		System.out.println(greeting);
		
	}

}
