package com.it.homework.t01;

public class Test01 {
/**
 * 第一题:分析以下需求,并用代码实现
	
	2.定义测试类:
		在测试类中打印出圆周率的值
		并且调用圆形周长的方法和圆形面积的方法
 * 
 */
	public static void main(String[] args) {
		//创建圆对象
		Circle c=new Circle(15.5);
		//打印圆周率的值
		System.out.println(c.getPI());
		
		//周长
		System.out.println("周长："+Math.round(c.getPerimeter()*100)/100.0);
		//面积
		System.out.println("面积："+Math.round(c.getArea()*100)/100.0);
	}
	
}
