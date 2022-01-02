
package com.vishal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo 
{
	 public static void main(String args[])
	 {
	        List<String> ls=new LinkedList<String>();
	        
	        ls.add("Pavan");
	        ls.add("Ajay");
	        ls.add("Siddharth");
	        ls.add("kunal");
	        System.out.println("The LinkedList Element are:");
	        Iterator it=ls.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	  }
}
