package com.biz.classes;

public class MyClassExec09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass09 m = new MyClass09();

		// FILO(First In Last Out 형식의 stack 자료구조 
		// stack
		m.push("대한민국");
		m.push("우리나라");
		m.push("Korea");
		m.push("Republic of Korea");

		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();

	}

}
