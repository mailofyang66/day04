package com.it.homework.t05;
/*
 * 第五题：分析以下需求，并用代码实现
	interface Inter {
		void show(); 
	}
	class Outer { 
		//补齐代码 
		public static Inter method() { 
			
		}
	}
	public class OuterDemo {
		public static void main(String[] args) {
			Outer.method().show();
		}
	}
	要求在控制台输出”HelloWorld”
 */
//接口
interface Inter{
	public abstract void show();
}

//Outer类
class Outer{
	public static Inter method(){
		//返回匿名内部类对象
		return new Inter(){
			@Override
			public void show() {
				System.out.println("show方法调用了");
			}
			
		};
	}
}

//测试方法
public class Test05 {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
