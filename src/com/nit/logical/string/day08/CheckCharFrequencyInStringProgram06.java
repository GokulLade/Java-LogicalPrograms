package com.nit.logical.string.day08;

public class CheckCharFrequencyInStringProgram06 {

	public static void main(String[] args) 
	{
		  String str="Gokulladepatil";
		  
		  char ch[]=str.toCharArray();
		  
		  for(int i=0;i<ch.length;i++)
		  {
			  char temp=ch[i];
			  int count=0;
			  
			  if(temp=='*')
			  {
				  continue;
			  }
			  
			  for(int j=0;j<ch.length;j++)
			  {
				  if(temp==ch[j])
				  {
					count++;
					ch[j]='*';
				  }
			  }
			  
			  System.out.println("The frequency of the "+temp+" is "+count);
		  }
		  
		  
	}

}
