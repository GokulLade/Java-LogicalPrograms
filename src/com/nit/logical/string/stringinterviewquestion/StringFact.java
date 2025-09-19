package com.nit.logical.string.stringinterviewquestion;

public class StringFact {

	public static void main(String[] args) {
		// Creating string
		String str = "I am from Washim which is located in Maharashtra";

		for (int i = 1; i < str.length(); i++) 
		{
			if (str.length() % i == 0) 
			{
				if (str.charAt(i) == ' ')
					System.out.print(str.charAt(i + 1));
				else
					System.out.print(str.charAt(i));
			}

		}
	}
}
