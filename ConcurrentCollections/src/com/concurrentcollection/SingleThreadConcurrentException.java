package com.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingleThreadConcurrentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			//list.add("Test");
			
			list.remove("A");
		}

	}

}
