package com.learnSpring.learn_Spring_framework.game;

public class MarioGame implements GamingConsole {
     public void up() {
    	 System.out.println("Jump");
     }
     public void Down() {
    	 System.out.println("Sit");
     }
     public void left() {
    	 System.out.println("Go Left");
     }
     public void right() {
    	 System.out.println("Go right");
     }
}
