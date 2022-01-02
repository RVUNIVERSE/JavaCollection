package com.vishal;

public class myMatrixThread implements Runnable{
	static int noOfObject;
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int b[][]={{1,2,3},{4,5,6},{7,8,9}};
	int c[][]=new int[3][3];
	int row;
	int size=3;
	String name;
	myMatrixThread(int row_id)
	{
		this.row=row_id;
	}
	public void run()
	{
		matrixlogic();
		for(int i=0;i<size;i++){
			System.out.print(c[row][i]+"");
		}
		System.out.println();
	}
	public void matrixlogic()
	{
		for (int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				for(int k=0;k<size;k++){
					c[i][j]=a[i][k]*b[k][j];
				}
			}
		}	
	}
	public static void main (String args[]) throws  InterruptedException
	{
		Thread ob1=new Thread(new myMatrixThread(0));
		Thread ob2=new Thread(new myMatrixThread(1));
		Thread ob3=new Thread (new myMatrixThread(2));
		ob1.start();
		ob2.sleep(100);
		ob2.start();
		ob3.sleep(200);
		ob3.start();
	}
}