package com.sh.app;

import com.sh.animal.Cat;
import com.sh.animal.Dog;
import com.sh.animal.Rabbit;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		new Dog().bark();
		new Cat().jump();
		new Rabbit().jump();
	}
	
	public void test() {
		System.out.println("Main#test");
	}
}
