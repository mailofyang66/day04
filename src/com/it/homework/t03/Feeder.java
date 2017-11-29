package com.it.homework.t03;

public class Feeder {
	
	public void feed(Animal animal,String food){
		
		animal.drink();
		animal.eat(food);
		if(animal instanceof Swimming){//如果实现了游泳接口
			Swimming s=(Swimming) animal;
			s.swim();
		}
	}
}
