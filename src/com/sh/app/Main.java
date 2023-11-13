package com.sh.app;

import com.sh.animal.Cat;
import com.sh.animal.Dog;
import com.sh.animal.Rabbit;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello Git");
		
		new Dog().bark();
		new Cat().jump();
		new Rabbit().jump();
	}

}
