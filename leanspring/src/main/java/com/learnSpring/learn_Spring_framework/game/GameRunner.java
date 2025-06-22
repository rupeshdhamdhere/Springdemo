package com.learnSpring.learn_Spring_framework.game;

public class GameRunner {
	//	private GamingConsole game;
		private GamingConsole game;
		public GameRunner(GamingConsole game) {
			this.game=game;
		}

		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Running Game is " + game);
			game.up();
			game.Down();
			game.left();
			game.right();
		}
}
