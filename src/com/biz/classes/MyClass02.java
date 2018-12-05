package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	int intNum;
	List<Integer> intList;

	public MyClass02() {
		intList = new ArrayList();
	}

	public void push(int A) {
		this.intNum = A;
		intList.add(intNum);
	}

	public void show() {
		int intMul = 1;

		int intCount = intList.size();
		for (int i = 0; i < intCount; i++) {
			int intGet = intList.get(i);
			intMul = intGet * intMul;
		}
		System.out.println(intMul);
	}

}
