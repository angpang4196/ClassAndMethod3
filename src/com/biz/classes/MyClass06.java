package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	String strSen;
	List<String> stList;

	public MyClass06() {
		stList = new ArrayList();
	}

	public void push(int intNum) {
		strSen = String.valueOf(intNum);
		stList.add(strSen);
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
