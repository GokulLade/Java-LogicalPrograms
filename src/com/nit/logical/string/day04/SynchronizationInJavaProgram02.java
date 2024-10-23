package com.nit.logical.string.day04;

// Program to perform the synchronization operation

class PrintTable{
	public synchronized void printTable(int data) 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println((data*i)+" ");
		}
		
	}
	
}

class User1 extends Thread{
	PrintTable app;
	
	int data;

	public User1(PrintTable app, int data) 
	{
		super();
		this.app = app;
		this.data = data;
	}
	
	@Override
	public void run() 
	{
		app.printTable(data);
		
	}
	
	
}

class User2 extends Thread{
	
	PrintTable app;
	
	int data;

	public User2(PrintTable app, int data) 
	{
		super();
		this.app = app;
		this.data = data;
	}
	
	@Override
	public void run() 
	{
		app.printTable(data);
		
	}
	
}

public class SynchronizationInJavaProgram02 {
	
	public static void main(String[] args) 
	{
		PrintTable app = new PrintTable();
		
		User1 user1=new User1(app, 5);
		User2 user2=new User2(app, 10);
		
		user1.start();
		user2.start();
	}
}
