package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	int intNum;
	List<Integer> intList;

	public MyClass04() {
		intList = new ArrayList();
	}

	public void push(String s) {
		intNum = Integer.valueOf(s);
		intList.add(intNum);
	}

	public int show() {
		int intMul = 1;

		int intCount = intList.size();
		for (int i = 0; i < intCount; i++) {
			int intGet = intList.get(i);
			intMul = intGet * intMul;
		}
		return intMul;
	}

}
