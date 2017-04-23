package com.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArraySet set = new CopyOnWriteArraySet();	
		
		set.add("A");
		set.add("c");
		set.add("D");
		set.add("D");
		set.add(null);
		
		Iterator itr = set.iterator();
		
		//this test variable is not displayed in output because 
		
		//iterator object is created for old set object not for the cloned copy
		//set.add("test");
		
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			//itr.remove();
			
			//RuntimeException saying unsupportedoperationException
		}

	}

}
