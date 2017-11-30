package com.design;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		Bottom b=new Bottom();
		b.addOnClick(new OnClick() {
			@Override
			public void click() {
				System.out.println("注册");
			}
		});
		
		b.addOnClick(new OnClick() {
			@Override
			public void click() {
				System.out.println("登录");
			}
		});
		
		b.addOnClick(new OnClick() {
			@Override
			public void click() {
				System.out.println("退出");
			}
		});
		
		b.DoSomethings();
		
	}
}


class Bottom{
	
	List<OnClick> list = new ArrayList<OnClick>();
	
	public void addOnClick(OnClick click){
		list.add(click);
	}
	
	public void DoSomethings(){
		for (OnClick onClick : list) {
			onClick.click();
		}
	}
}


interface OnClick{
	
	public abstract void click();
}