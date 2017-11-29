package com.it.homework.t02;

public class Test02 {
/*
 * 第二题:分析以下需求,并用代码实现
	1.接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？
		要求1.创建子类实现接口的方式实现
		要求2:用匿名内部类实现

	2.一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法?
		要求1.创建子类继承抽象类的方式实现
		要求2:用匿名内部类实现
 */
	
	public static void main(String[] args) {
		IPlay p1=new IPlayDerive();
		p1.playGame();
		//匿名内部类实现
		new IPlay(){

			@Override
			public void playGame() {
				System.out.println("匿名内部类实现");
			}
		}.playGame();;
		System.out.println("--------------------------");
		//fun
		Fun f=new FunChild();
		f.fun();
		
		//匿名内部类实现
		new Fun(){

			@Override
			public void fun() {
				System.out.println("匿名内部类实现fun");
			}
			
		}.fun();;
	}
}
