package com.learnspringwithgit.leanspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspringwithgit.leanspring.game.GameRunner;
import com.learnspringwithgit.leanspring.game.GamingConsole;

public class App03BasicGamingSpringBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
          context.getBean(GamingConsole.class).up();
          context.getBean(GameRunner.class).run();
	}

}
