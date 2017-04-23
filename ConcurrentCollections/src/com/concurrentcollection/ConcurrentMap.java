package com.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap map = new ConcurrentHashMap();
		
		map.put(101, "test");
		map.put(102, "ABC");
		map.putIfAbsent(103, "xyz");
		map.putIfAbsent(101, "D");
		map.remove(101, "D");
		map.replace(102, "ABC", "sujani");
		
		
		System.out.println(map);

	}

}
