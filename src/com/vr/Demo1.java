package com.vr;

import java.util.Scanner;


public class Demo1 {
     public static void main(String args[])
    {
        int i,n;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the "+n+" Elements");
        for(i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(i=1;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
