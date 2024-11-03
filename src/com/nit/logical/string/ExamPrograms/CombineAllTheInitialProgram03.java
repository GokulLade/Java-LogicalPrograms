package com.nit.logical.string.ExamPrograms;

public class CombineAllTheInitialProgram03 {

	public static void main(String[] args) 
	{
		String str="Mahendra Singh Dhoni"; // M.S.D
		
		char ch1[]=str.toCharArray();
		char ch[]=new char[str.length()];
		
		for(int i=0,a=0;i<ch1.length;i++,a++)
		{
			
			if(i==0)
			{
				System.out.print(ch1[0]);
			}
			if(ch1[i]==' ')
			{

				System.out.print("."+ch1[i+1]);
			}
		}
		

	}

}
