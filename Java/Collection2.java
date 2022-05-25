package com.collectionprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Collection2 {
	public static void main(String args[])
	{
		List<String> lst = new ArrayList<String>();
		lst.add("abc");
		lst.add("pqr");
		lst.add("xyz");
		lst.add("lmn");
		System.out.println(lst);
		
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
			
		}
	}

}
