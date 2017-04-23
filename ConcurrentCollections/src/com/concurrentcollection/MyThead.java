package com.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyThead extends Thread{
	
	static List list = new ArrayList();
	
	public void run(){
		try{
			Thread.sleep(200);
		}
		catch(Exception e){
			System.out.println("in the catch block");
		}
		System.out.println("child trhead updating");
		list.add("D");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		MyThead thread = new MyThead();
		// there are two threads after this step main thread and child thread 
		thread.start();
		
		
		//main thread iterating list
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			
			String s1 = (String)itr.next();
			System.out.println("main thread iterating list"+s1);
			Thread.sleep(200);
		}
		System.out.println(list);
	}
}
