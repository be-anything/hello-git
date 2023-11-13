package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Cat;
import com.sh.animal.Chicken;
import com.sh.animal.Dog;
import com.sh.animal.Rabbit;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		System.out.println("Animal Go ~ ");
		new Dog().bark();
		new Cat().jump();
		new Cat().say();
		new Rabbit().jump();
		new Bird().fly();
		new Chicken().run();
	}
	
	public void test() {
		System.out.println("Main#test");
	}
}
