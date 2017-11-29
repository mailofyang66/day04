package com.it.ys.keylimt;

public   class Student {
	private String name;
	int age;
	protected Long number;
	public double PI;
	
	void function(){
		System.out.println("function");
	}
}



class Tewt extends Student{
	public void fun(){
		this.age=10;
	}
	
	
}

class Test01{
	public void fun(){
		Student s = new Student();
		s.age=10;
	}
}