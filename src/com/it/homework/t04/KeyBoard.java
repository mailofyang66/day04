package com.it.homework.t04;

public class KeyBoard implements USB {

	@Override
	public void open() {
		System.out.println("usb连接键盘");
	}

	@Override
	public void close() {
		System.out.println("usb断开键盘");
	}

}
