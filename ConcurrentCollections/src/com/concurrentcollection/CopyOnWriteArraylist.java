package com.concurrentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List arraylist = new ArrayList();
		
		arraylist.add("normal arraylist");
		arraylist.add("normal arraylist second element");
		
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		
		list.add("D");
		
		//methods present in copyonwritearraylist
		
		list.addIfAbsent("A");
		list.addIfAbsent("c");
		list.addAllAbsent(arraylist);
		
		System.out.println(list);
		

	}

}
