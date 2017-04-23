package com.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List arraylist = new ArrayList();
		
		arraylist.add("normal arraylist");
		arraylist.add("normal arraylist second element");
		
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		//ArrayList list = new ArrayList();
		
		list.add("D");
		list.add("Dog");
		list.add("e");
		
		//methods present in copyonwritearraylist
		
		/*list.addIfAbsent("A");
		list.addIfAbsent("c");
		list.addAllAbsent(arraylist);*/
		
		
		System.out.println("printing directly ");
		System.out.println(list);
		
		System.out.println("printing using iterator");
		
		Iterator itr = list.iterator();
		
		list.add("after creating iterator");
		
		list.add("test");
			while(itr.hasNext()){	
				System.out.println(itr.next());
			}
		
			/*System.out.println("printing directly after adding  ");
			System.out.println(list);
			*/
	}

}
