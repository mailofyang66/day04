package com.it.homework.t03;

public class Dog extends Animal implements Swimming {

	@Override
	public void swim() {
		System.out.println("狗刨式游泳");

	}

	@Override
	public void eat(String food) {
		System.out.println("狗啃"+food);

	}

}
