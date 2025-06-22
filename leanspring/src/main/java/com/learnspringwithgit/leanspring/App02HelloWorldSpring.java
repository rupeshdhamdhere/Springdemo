package com.learnspringwithgit.leanspring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
    //here we will launch a spring context 
	// we will use annotation config application context class for that and will fetch the bean created in the configuration file
	// as follows
	//And we will get that beat by getBean method and will print it;
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean(String.class));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3callbyparameters"));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // to get list of all beans created and managed by java for that we  use loop
		// to get the total of bean count use following 
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(context.getBean(Address.class)); //this gives output instead of error because we made one address as primary
		System.out.println(context.getBean("person4callbyparameters")); //now it autowired and shows address from @qualifier
		
	}
   
}
