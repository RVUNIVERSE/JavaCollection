package com.vishal;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorArray {

	public static void main(String[] args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        
        Vector<Integer> v1=new Vector<Integer>();
        v1.addAll(arr);
        
        System.out.println(v1);
        
        Enumeration<Integer> en=v1.elements();
        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
        
        Iterator<Integer> it=v1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


	}

}
