package com.it.homework.t03;

public abstract class Animal {

	private int age;//年龄

	public Animal() {
		super();
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//未实现的抽象方法
	public void drink(){
		System.out.println("喝水");
	}
	
	public abstract void eat(String food);
}
