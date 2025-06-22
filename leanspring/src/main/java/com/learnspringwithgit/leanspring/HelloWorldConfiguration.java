package com.learnspringwithgit.leanspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
record Person(String name, int age) {
};

//Record is nothing but it is new feature from java 16 detects the type automatically
record Address(String line1, String line2) {
};

public class HelloWorldConfiguration {

	// Now we will create our first Bean
	// To create Bean we need keyword As Bean
	@Bean
	public String name() {
		return "RupeshD";
	}

	// now we will create multiple beans an will access them from other file
	@Bean
	public Person person() {
		return new Person("Rupesh", 22);
	}

	@Bean
	public int age() {
		return 52;
	}

	@Bean(name = "Total Marks") // for rename purpose now to retrieve bean by name we have to use "Total marks
								// instead of "marks";
	public int marks() {
		return 25;
	}
	// we will create new bean from Existing one it o=is having two ways
	// way 1 -> call by method
	//way 2 -> call by parameter
	@Bean
	public Person person2() {  //this is call  by method here we use name and age bean with type person to create new bean called person2
		return new Person (name() , age() );
	}

}