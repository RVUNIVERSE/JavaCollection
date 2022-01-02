package com.vishal;

//We don't need to typecast individual members of ArrayList 
import java.util.*; 

class Test2 
{ 
 public static void main(String[] args) 
 { 
     ArrayList <String> al = new ArrayList<String> (); 

     al.add("Sachin"); 
     al.add("Rahul"); 

     // Typecasting is not needed  
     String s1 = al.get(0); 
     String s2 = al.get(1); 
     
     System.out.println(s1);
     System.out.println(s2);
 } 
} 
