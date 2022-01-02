package com.vishal;

import java.util.Iterator;
import java.util.Vector;

public class VectorIndex
{
	public static void main(String[] args) 
	{
		Vector < Integer > ve = new Vector < Integer > ();
		  ve.add(10);
		  ve.add(20);
		  ve.add(30);
		  ve.add(40);
		  ve.add(50);
		  
		  System.out.println("Vector ve :--> " + ve);

		  int a = ve.indexOf(50);
		  int b = ve.capacity();
		 
		  System.out.println("The index Of element in the Vector ve is :--> " + a);
		  System.out.println("The capacity Of element in the Vector ve is :--> " + b);
	}
}
