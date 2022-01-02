package com.vishal;

import java.util.Iterator;
import java.util.Vector;
class myVectorString{
	public static void main(String args[]){
		Vector <String> ve=new Vector <String>();
		ve.add("ram");
		ve.add("sam");
		
	
		System.out.println("my vector:-->"+ve);
		Iterator<String> it=ve.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ "");
		}
		
		
	}
}