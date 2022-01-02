package com.vishal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class demo2 
{
	public static void main(String vr[]) 
	{
		Collection<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(3);
	
		for(int i:li) {
			System.out.println(i);
		}		
	}
}
