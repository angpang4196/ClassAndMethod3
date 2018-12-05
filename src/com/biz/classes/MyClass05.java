package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {

	String strSen;
	List<String> stList;

	public MyClass05() {
		stList = new ArrayList();
	}

	public void push(String s) {
		
		stList.add(s);
	}

	public String show() {
		strSen = "";
		int intCount = stList.size();
		for (int i = 0; i < intCount; i++) {
			String num = stList.get(i);
			strSen += num;
		}
		return strSen;
	}

}
