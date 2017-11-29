package com.it.homework.t04;

public class NoteBook {
	
	public void startUp(){
		System.out.println("开机");
	}
	public void shutDown(){
		System.out.println("关机");
	}
	
	public void ConnectUSB(USB usb){
		usb.open();
		usb.close();
	}
}
