
package com.vr;


public class myThreadSynImp {
    public static void main(String args[])
    {
        myThreadSyn ob1=new myThreadSyn("One",1000,9);
        myThreadSyn ob2=new myThreadSyn("Two",2000,2);
        myThreadSyn ob3=new myThreadSyn("Three",1500,6);
        
        System.out.println("Thread one is Alive:"+ob1.t.isAlive());
        System.out.println("Thread Two is Alive:"+ob2.t.isAlive());
        System.out.println("Thread Three is Alive:"+ob3.t.isAlive());
        
        try
        {
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
        }
        
        catch(InterruptedException e)
        {
            System.out.println("Main Thread is Interrupted");
        }
        System.out.println("Thread one is Alive:"+ob1.t.isAlive());
        System.out.println("Thread Two is Alive:"+ob2.t.isAlive());
        System.out.println("Thread Three is Alive:"+ob3.t.isAlive());
    }
}
