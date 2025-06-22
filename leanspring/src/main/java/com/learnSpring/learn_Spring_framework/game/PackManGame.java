package com.learnSpring.learn_Spring_framework.game;

public class PackManGame implements GamingConsole {
	public void up() {
   	 System.out.println("Go ");
    }
    public void Down() {
   	 System.out.println("Stop");
    }
    public void left() {
   	 System.out.println("Attack");
    }
    public void right() {
   	 System.out.println("Defend");
    }


}
