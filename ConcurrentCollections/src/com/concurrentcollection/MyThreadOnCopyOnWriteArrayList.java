package com.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThreadOnCopyOnWriteArrayList extends Thread {
	
static CopyOnWriteArrayList clist = new CopyOnWriteArrayList();
	
	
	public void run(){
		try{
			Thread.sleep(2000);
		}
		catch(Exception e){
			System.out.println("inside catch block");
		}
	  clist.add("by child thread");
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		clist.add("a");
		clist.add("d");
		
		MyThreadOnCopyOnWriteArrayList thread = new MyThreadOnCopyOnWriteArrayList();
		thread.start();
		
		Iterator itr = clist.iterator();
	
		while(itr.hasNext()){
			System.out.println(itr.next());
			Thread.sleep(2000);
		}
		
		System.out.println(clist);
	}

}
