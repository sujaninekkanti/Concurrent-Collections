package com.concurrentcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap map = new ConcurrentHashMap();
		
		map.put(23, "twentythree");
		map.put(1,"one");
		
		Set mapkeys = map.keySet();
		
		Iterator itr = mapkeys.iterator();
		
		//map.put("test", "test");
		
		while(itr.hasNext()){
			
			Integer i = (Integer)itr.next();
			System.out.println(itr.next() +" "+ map.get(i));
			map.put("test", "test");
			 
		}
		
		System.out.println(map);

	}

}
