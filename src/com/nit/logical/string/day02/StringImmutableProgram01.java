package com.nit.logical.string.day02;

/*

Q1. What is Immutable?
	->Immutable class in java means that once an object is created, we cannot change its content.
      In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
      or we can say
      
     Immutable :-
     -> Once object is created you can't modified the 
        same object. 
     -> If we try to modify a new object will be created
        this is known as immutable
              
     -> String is a immutable class
	
Q2. Why String class is known as Immutable class?
	->Because String class is made by following below 
      rule and we can create the our own custom immutable class by 
      following the same 

 
	a. The class must be declared as final so that child classes can’t be created.
	b. Data members in the class must be declared private so that direct access is not allowed.
	c. Data members in the class must be declared as final so that we can’t change 
	   the value of it after object creation.
	d. A parameterized constructor should initialize all the fields performing  
	   a deep copy so that data members can’t be modified with an object reference.
	e. Deep Copy of objects should be performed in the getter methods to return a  
	   copy rather than returning the actual object reference)

Q3. How to create a custom Immutable class?
	->Create the String class and how it is immutable as we are going to create the 
	  String class and we area going to modify the String object then instead of 
  	  modifying the same String it will create a new Object everytime 


Q4. Adv of String for immutability
	->It will provide the security as someone trying to modify the 
      our data instead of modification it will create a new object as a result 
      our original Data is safe

Q5. When we will go for creating String class
	->When we need original data as well as the modified data we will go for creating the 
      String class as we know if modification happen always String will create a new object 
      as a result the old object and modified object both the object will with us .

*/

// Programs for the proff of immutable concept:

class FloodArea{
	 private String stateName;
	 private int amount;
	 
	 public FloodArea() {
		stateName="empty";
		amount=0;
	}

	public FloodArea(String stateName, int amount) {
		super();
		this.stateName = stateName;
		this.amount = amount;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "FloodArea [stateName=" + stateName + ", amount=" + amount + "]";
	}
	 
	 
}

class GovCampaign{
	 
	   public static void releaseFund(int amount,FloodArea area,String address) {
		    if(area.getStateName().equals(address)) {
		    	 area.setAmount(area.getAmount()+amount);
		    	 System.out.println("Amount added!!");
		    	 System.out.println(area);
		    }
		    else {
		    	 System.err.println("State is not in the list now!!");
		    }
	   }
}
public class StringImmutableProgram01 {

	public static void main(String[] args) 
	{
		String address="bihar";
		int fund=50000;
		FloodArea area=new FloodArea(address, fund);
		System.out.println(area);
		String address1=address.concat("goa");
		int releaseFund=100000;
		GovCampaign.releaseFund(releaseFund,area,address);
		System.out.println(area);

	}

}
