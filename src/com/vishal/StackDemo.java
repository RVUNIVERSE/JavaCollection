package com.vishal;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo
{
	public static void main(String args[])
	 {
	     Stack<String> mySt=new Stack<String>();
	     mySt.push("Hi");
	     mySt.push("How");
	     mySt.push("hello");
	     mySt.push("who");
	     mySt.pop();
	     
	     Iterator<String> it=mySt.iterator();
	     while(it.hasNext())
	     {
	         System.out.println(it.next());
	     }
	     
	 }
}
