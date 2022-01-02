package com.vishal;
import java.util.*; 

class Test 
{ 
	public static void main(String[] args) 
	{ 
		ArrayList <String> al = new ArrayList<String> (); 
		al.add("Sachin"); 
		al.add("Rahul"); 

		// Now Compiler doesn't allow this 
		//al.add(10); 

		String s1 = (String)al.get(0); 
		String s2 = (String)al.get(1); 
		//String s3 = (String)al.get(2); 
		
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);		
	} 
} 
