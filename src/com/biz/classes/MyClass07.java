package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	String strNation;
	String[] strSp;

	public void insert(String strNation) {
		this.strNation = strNation;
		strSp = strNation.split("");
	}

	public void show() {
		int intLen = strSp.length;

		for (int i = 0; i < intLen; i++) {
			String strAlpha = strSp[i] + ", ";
			System.out.print(strAlpha);
			if (i == (intLen - 1)) {
				System.out.println("-" + intLen + "글자");
			}
		}
	}
}
