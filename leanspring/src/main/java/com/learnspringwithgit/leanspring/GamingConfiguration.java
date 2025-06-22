package com.learnspringwithgit.leanspring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspringwithgit.leanspring.game.*;

@Configuration

public class GamingConfiguration {
     
	@Bean
	public GamingConsole game() {
		var game = new PackManGame();
		return game;
	}
	@Bean
	public GameRunner gamerun(GamingConsole game) { //Here we call by Parameter also we can use direclty by method ad game() it will fetch from above callled wiring
		var gamerun = new GameRunner(game);
		return gamerun;
	}
	
}
