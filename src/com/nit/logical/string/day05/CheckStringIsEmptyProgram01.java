package com.nit.logical.string.day05;

/*
 
 Checking the string is empty or not
 	1. length():
 		With the help of String length method but the drawback is if we give string
		with space so string don't have any data so as per user view String is empty
		means without data but actually it's having the space as a result the length
		method will show the length is not equals to zero means string is not empty.
    
    2. trim():
    	So for the above length method drawback we are adding the trim method with it
		as a result trim will remove the space from front and back of the string and
		if the string contains spaces it will remove and make it as empty string then
		we can use length method for checking
    
    3. isEmpty():
    	But in the above way we are writing lines of the code for checking only one
		condition that way in java 1.6 string had provided the method name as isEmpty
		which will check the string is empty or not ,but again it's have a problem
		for solving that again we have to use trim method , then there will be no
		diff on using length() and isEmpty()
    
    4. isBlank():
    	So for the above all problem in java 11 string 
        had provided one method known as isBlank()
        method which will work for both empty and 
        string with the space
 
 */

// Programming view of checking string is empty or not

class User{
	private String userName;
	private String password;
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

class LoginApplication{
	private String userName;
	private String password;
	User user;
	
	public LoginApplication(User user)
	{
		this.user=user;
		
	}
	
	public boolean checkLogin(String userName, String password) {
		
//		userName=userName.trim();
//		password=password.trim();
		if((!userName.isBlank() && !password.isBlank()))
		{
			if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) 
			{
				return true;
			}
		}
		return false;
		
	}
	
	
}

public class CheckStringIsEmptyProgram01 {

	public static void main(String[] args) 
	{
		String userName="Gokul";
		String password="1234";
		
		User user =new User(userName, password);
		
		LoginApplication app=new LoginApplication(user);
		
		if(app.checkLogin("  ", "   "))
		{
			System.out.println("Login Successfull..!!");
		}
		else
		{
			System.err.println("Login Fail.. Try again..!!");
		}
		
		
	}

}
