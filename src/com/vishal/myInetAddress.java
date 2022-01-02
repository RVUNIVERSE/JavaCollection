package com.vishal;

import java.net.*;
class myInetAddress{
	InetAddress ia;
	String hostname;
	
	myInetAddress(){}
	myInetAddress(String HostName){
		this.hostname=HostName;
	}
	public void getAllIPAddress(String hostname)
	{
		try{
			InetAddress ia[]=InetAddress.getAllByName(hostname);
			System.out.println("Total "+ia.length+"IP Address are returned");
			for(int i=0;i<ia.length;i++)
			{
				System.out.print("["+i+"]-->"+ia[i].getHostAddress());
			}
		}
		catch(Exception e){
			System.out.println("ERROR -->"+e.toString());
		}
	}

}