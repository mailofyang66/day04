package com.it.homework.t03;

public class Frog extends Animal implements Swimming{

	@Override
	public void swim() {
		System.out.println("青蛙游泳蛙泳");
	}

	@Override
	public void eat(String food) {
		System.out.println("青蛙吃"+food);
	}

}
