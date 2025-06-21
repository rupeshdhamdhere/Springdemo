package com.learnspringwithgit.leanspring;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
record Person(String name , int age) {};
//Record is nothing but it is new feature from java 16 detects the type automatically
public class HelloWorldConfiguration {
	
		// Now we will create our first Bean
		// To create Bean we need keword As Bean
        @Bean
		public String name() {
			return "Rupesh";
	}
   // now we will create multiple beans an will access them from other file
       @Bean
      public Person person() {
    	  return new Person("Rupesh" , 22);
      } 
}
