package com.vr;
import java.util.*;

public class ArrLsDemo {
    public static void main(String[] a)
    {
        int n=5;
        List<Integer> ls=new ArrayList<Integer>(n);
        
      for(int i=1;i<=n;i++)
      {
          ls.add(i);
      }
      
      System.out.println(ls);
           
      for(int i=0;i<ls.size();i++)
           System.out.println(ls.get(i)+" ");
    }
}
