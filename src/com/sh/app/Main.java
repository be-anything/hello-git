package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Chicken;
import com.sh.animal.Dog;
import com.sh.animal.Rabbit;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		System.out.println("동물기능 시작~");
		System.out.println("Animal Go ~ ");
		new Dog().bark();
		new Rabbit().jump();
		new Bird().fly();
		new Chicken().run();
	}
	public void def(){
		
	}
	public void abc(){
		
	}
	public void test() {
		System.out.println("Main#test");
		System.out.println("Main#test");
	}
}
