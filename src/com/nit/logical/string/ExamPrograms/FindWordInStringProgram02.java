package com.nit.logical.string.ExamPrograms;

public class FindWordInStringProgram02 {

	public static void main(String[] args) 
	{
		String str="This is orange juice";//  Find the word  "orange"
		String word="orange";
		
		String str1[]=str.split(" ");
		
		int found=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(word))
			{
				found++;
			}
			
		}
		if(found==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}

}
