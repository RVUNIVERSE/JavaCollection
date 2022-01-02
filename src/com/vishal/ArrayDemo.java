package com.vishal;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("rathod");
		list.add(" vishal");
		list.add(" vitthal");
		
		Iterator<String> it=list.iterator();
		System.out.println("Array list:");
		while(it.hasNext())
		{
			System.out.print(it.next()+"");
		}
	}

}
