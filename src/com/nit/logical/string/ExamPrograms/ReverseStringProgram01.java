package com.nit.logical.string.ExamPrograms;

public class ReverseStringProgram01 {

	public static void main(String[] args) 
	{
		String str="WorkHard";	//  output:  draHkroW
		
		char ch[]=str.toCharArray();
		char ch1[]=new char[str.length()];
		
		for(int i=ch.length-1,a=0;i>=0;i--,a++)
		{
			ch1[a]=ch[i];
		}

		String result=new String(ch1);
		
		System.out.print(result);
	}

}
