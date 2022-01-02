package com.vr;

public class myThreadSyn implements Runnable{
    String name;
    Thread t;
    int sleepT;
    int pt;
    
    public myThreadSyn(String st,int slt,int ptr)
    {
        name=st;
        pt=ptr;
        sleepT=slt;
        
        t=new Thread(this,name);
        System.out.println("New Thread: "+t);
        t.start();
        t.setPriority(pt);
    }
    public void run()
    {
        for(int i=5;i>0;i--)
        {
            try
            {
            System.out.println(name+":"+i);
            t.sleep(sleepT);
            }
            catch(InterruptedException e)
            {
                System.out.println(name+" Interrupted");
            }
            
        }
        System.out.println(name+" Exiting");
        
    }
}

