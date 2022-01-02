
package com.vr;
import java.util.*;

public class LinkList {
    public static void main(String args[])
    {
        List<String> ls=new LinkedList<String>();
        
        ls.add("Rohit");
        ls.add("Ajay");
        ls.add("Siddhant");
        
        System.out.println("The LinkedList Element are:");
        Iterator it=ls.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
