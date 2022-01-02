/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vr;
import java.util.*;

public class myQueue {
    public static void main(String arh[])
    {
        PriorityQueue<String> myq=new PriorityQueue<String>();
        myq.add("Ajay");
        myq.add("bhaiyya");
        myq.add("chetan");
        myq.add("dipesh");
        
        System.out.println("Head:"+myq.element());
        System.out.println("Head:"+myq.peek());
        
        System.out.println("Iterating the queue element");
        Iterator it=myq.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        myq.remove();
        myq.poll();
        Iterator it2=myq.iterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next()+" ");
        }
    }
}
