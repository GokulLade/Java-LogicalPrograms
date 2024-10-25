package com.nit.logical.string.day07;

//Finding number in string
public class FindingTheNumberInStringProgram04 {
	
	public static void main(String[] args) 
	{
		String str="Hello Gokul My Contact Number is +912929193401";
		
		String number[]=str.split("\\D+");
		
		for (String num : number) 
		{
            if (!num.isEmpty()) 
            {
                System.out.println(num);
            }
        }
		
	}


}
