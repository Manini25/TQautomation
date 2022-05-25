package com.collectionprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
	
	public static void main(String args[])
	{
		List lst = new ArrayList();
		System.out.println(lst.isEmpty());   //true
		
		lst.add(456);
		lst.add("abc");
		lst.add('r');
		System.out.println(lst);            // [456,abc,r]
		System.out.println(lst.isEmpty());  //false
		
		Iterator itr = lst.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}

}
