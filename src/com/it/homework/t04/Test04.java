package com.it.homework.t04;

public class Test04 {
	public static void main(String[] args) {
		
		NoteBook noteBook = new NoteBook();
		//开机
		noteBook.startUp();
		//鼠标
		noteBook.ConnectUSB(new Mouse());
		//键盘
		noteBook.ConnectUSB(new KeyBoard());
		//关机
		noteBook.shutDown();
	}
}
