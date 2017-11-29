package com.it.homework.t03;

public class Test03 {
	
	public static void main(String[] args) {
		
		Feeder feeder = new Feeder();
		feeder.feed(new Dog(), "骨头");
		
		System.out.println("----------------------------");
		
		feeder.feed(new Sheep(), "草");
		System.out.println("----------------------------");
		feeder.feed(new Frog(), "虫子");
		
	}
}
