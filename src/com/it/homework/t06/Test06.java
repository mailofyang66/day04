package com.it.homework.t06;
/*
 * 要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
 */
public class Test06 {
	public static void main(String[] args) {
		
		A a = new A();
		a.methodA(new InterAImpl());
		
		System.out.println("_---------------------------");
		a.methodA(new InterA() {
			
			@Override
			public void showA() {
				System.out.println("匿名内部类的方式");
			}
		});
	}
}

// 定义接口
interface InterA {
	void showA();
}

class A {
	public void methodA(InterA a) {
		a.showA();
	}
}


class InterAImpl implements InterA{

	@Override
	public void showA() {
		System.out.println("直接实现的方式");
	}
	
}