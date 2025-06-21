package com.learnspringwithgit.leanspring;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class HelloWorldConfiguration {
	
		// Now we will create our first Bean
		// To create Bean we need keword As Bean
        @Bean
		public String name() {
			return "Rupesh";
	}

}
