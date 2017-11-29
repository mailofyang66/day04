package com.it.homework.t01;

public class Circle {
	/**
	 * 1.定义圆形类: 属性: 圆周率,圆的半径 行为: 求圆形周长的方法 求圆形面积的方法
	 */

	private double PI = Math.PI;
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 求圆的周长
	public double getPerimeter() {
		return PI * radius * 2;
	}

	// 求圆的面积
	public double getArea() {
		return PI * radius * radius;
	}
}
