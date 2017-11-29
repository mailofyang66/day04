package com.it.homework.t07;

public class Test07 {
	public static void main(String[] args) {
		
		//要求：在测试类Test14中创建B的对象b，并调用成员方法methodB
		
		//传递一个匿名内部类对象给B的有参构造
		B b = new B(new InterB(){
			@Override
			public void showB() {
				System.out.println("showB方法调用了");
			}
		});
		
		b.methodB();
	}
}

// 定义一个接口
interface InterB {
	void showB();
}

// 目标：调用成员方法methodB
class B {
	InterB b;// 这是一个引用数据类型，默认初始化值是null

	public B(InterB b) {
		this.b = b;
	}

	public void methodB() {
		b.showB();
	}
}