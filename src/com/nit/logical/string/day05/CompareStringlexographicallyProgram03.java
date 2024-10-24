package com.nit.logical.string.day05;
/*
Q1. Write the java program to compare the String lexographically ?
                    
   > It will return the result in int type.
   
   > It will compare each String character and if every character UNICODE value
     matched then it return 0.
     
   > if the character not matched then it return the difference between 
      the character of that 2 string.
    (which is the diff of their UNICODE value).
     
    > if the length is diffrent then it will it will return the diffrence between the 
     length of the two string. 
 
   > if the String character is not same and length is also different then 
      return the difference of the character.
 */
public class CompareStringlexographicallyProgram03 {
	
	public static int compareString(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					return str1.charAt(i)-str2.charAt(i);
				}
			}
			
		}
		
		return str1.length()-str2.length();
		
	}

	public static void main(String[] args) 
	{
		String str1="Gokul";
		String str2="Lade";
		
		System.out.println(CompareStringlexographicallyProgram03.compareString(str1,str2));
	}

}
