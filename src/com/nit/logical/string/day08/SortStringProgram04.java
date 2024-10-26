package com.nit.logical.string.day08;

// Sort the string ?
public class SortStringProgram04 {
	
	public static String sortString(String str)
	{
		char ch[]= str.toCharArray();
		char temp;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		String sortString =new String(ch);
		return sortString;
	}

	public static void main(String[] args) 
	{
		String str="Gokul";
		
		System.out.println("String is : "+str);
		System.out.println("Sorted String is : "+sortString(str));
		
	}

}
