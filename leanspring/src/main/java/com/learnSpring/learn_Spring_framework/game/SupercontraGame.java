package com.learnSpring.learn_Spring_framework.game;

public class SupercontraGame implements GamingConsole {
	public void up() {
   	 System.out.println("Jump");
    }
    public void Down() {
   	 System.out.println("Sit dowm");
    }
    public void left() {
   	 System.out.println("Accelerate");
    }
    public void right() {
   	 System.out.println("Stop");
    }

}
