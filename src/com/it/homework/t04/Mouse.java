package com.it.homework.t04;

public class Mouse implements USB {

	@Override
	public void open() {
		System.out.println("USB接入鼠标");

	}

	@Override
	public void close() {
		System.out.println("usb断开鼠标");
	}

}
