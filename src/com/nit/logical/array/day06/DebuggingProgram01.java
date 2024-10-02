package com.nit.logical.array.day06;

public class DebuggingProgram01 {

	public static void checkOutput(int a) { //5 4 3 2 1 0
		 if(a<0) {
			  return ;
		 }
		 System.out.println(a+1);//6 5 4 3 2
		 checkOutput(a-1);//4 3 2 1 0
		 System.out.println(a+1);
	}
	
	public static void main(String[] args)
	{
		
		DebuggingProgram01.checkOutput(5);

	}

}
