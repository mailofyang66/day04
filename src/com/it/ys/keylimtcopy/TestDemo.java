package com.it.ys.keylimtcopy;

import com.it.ys.keylimt.Student;

public class TestDemo extends Student {
	
	  static int  m=0;
	public static void main(String[] args) {
		
		
		Outer.Inner inner = new Outer.Inner();
		//理解：
		/*
		 * 成员内部类用static修饰后，表示在外部类被加载时就加载内部类，代表内部类的字节码文件已经到方法区了，可以用其创建对象
		 * new Inner();但是该内部类必须要指明是谁的内部类，故而内部类的名字用用Outer.Inner来表示，
		 * 所以创建内部类的语句就是new Outer.Inner();
		 */
		inner.fun();
		
		
		final int num=10;
		Fu f=new Fu(){
			@Override
			public void eat() {
				System.out.println("eat"+m);
			}
		};
	}
	
}


 class Outer{
	
	
	public int age;
	public void fun(){
		System.out.println("Outer-age");
	}
	
	static class Inner{
		public int age;
		
		public void fun(){
			System.out.println("Inner-fun");
		}
		
		public void innerFun(){
			System.out.println("private Fun");
		}
		
		static class InnerIn{
			private int a=10;
			public void fun(){
				System.out.println("InnerIn_fun");
			}
		}
	}
}

 
 interface Fu{
	 void eat();
 }