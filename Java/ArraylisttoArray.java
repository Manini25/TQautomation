//package com.collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class ArraylisttoArray {

	public static void main(String[] args) {
		List<String> str =new ArrayList<String>();
		str.add("ABC");
		str.add("PQR");
		str.add("LMN");
		
String[] arr=new String[str.size()];
str.toArray(arr);
for(String arr1:arr) {
	System.out.println(arr1);
}

	}

}