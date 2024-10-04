package com.nit.logical.array.day08;
/*
 
*About For each loop

Q1.What is for-each loop and purpose of for-each loop?

-> It is java 5 new feature,it is one of the forms of for loop
   It used for reterving elements from either array and 
   collection object.

 Syntax of for each loop

-> for(var dec : array/collection)
   {
      logic
   }

Sample code:
_______________
  int [] arr={1,2,3,4};
       for( int value : arr)
          {
           System.out.print(value+" ");
          }


 Player p1=new Player("Mahi",1);
 Player p2=new Player("Virat",2);
 Player p3=new Player("Rohit",3);

 Player [] players={p1,p2,p3};
 
 for(Player champions : players)
    {
      System.out.println(champions);
    }

--------------------------------------------------------

Q2.Why it is named as for each loop or enchanced for loop

	Because it iterates "for each" elements avaiable in given
	array until last location.
	
	It is also simplify the regular for loop logic. 
---------------------------------------------------------

Q3.Does JVM know this loop?

 ->	No,Jvm don't know about this loop syntax
	Compiler convert/rewrite for each as regular for loop
	with the index as given as java 1.4


       .java file                                  .class file
       _____________________                        ________________
       int [] arr={1,2,3,4};                        int [] arr={1,2,3,4}; 
       for( int value : arr)                        for(int i=0;i<arr.lengh;i++)
          {                                          {
           System.out.print(value+" ");                int value=arr[i];
          }                                            System.out.print(value+" ");
                                                     }
-----------------------------------------------------------

Rules on for-each loop
--------------------------
* We can only use : as seperators in for each loop ( ;  =  not allowed )

* Variable type must be "element compatable type" that is reterivng 
  from target variable.
  
  For Example 
  if array is the type of int then varaible where we are going to 
  store sholud be of same type or higher but not lower type.
   
* We cannot able to use cast operator to store elements in lesser 
  type variable.
 
* We can only use the variable inside the ( ) in for each loop
  if we want to deaclare it outside and initilize inside it is not 
  possible.
-------------------------------------------------------------------------

Limitations of the for each loop
------------------------------------

* It can be used to reterive the element available in array or collection.

* It reterive all the element from the array upto the last index or length. 

* It reterive the elements in sequentailly it not support random access.

* It cannot used to modify the value in the array/collection if we want some  
  modification for the elements we must go for regular for loop.

* If we want to display the value from 1-10 so in some other pattern we must 
  go for regular for loop beacause for printing it need condition and in 
  for each loop condition is not there.
  
*/

// Sample code

class Player{
	
	String playerName;
	int playerScore;
	
	public Player(String playerName, int playerScore) {
		super();
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerScore=" + playerScore + "]";
	}
	
	
}
public class ForEachLoopProgram01 {

	public static void main(String[] args) 
	{
		Player p1=new Player("Virat", 110);
		Player p2=new Player("Mahi", 70);
		Player p3=new Player("Rohit", 45);
		
		Player p[]= {p1,p2,p3};
		
		for(Player value:p) {
			System.out.println(value);
		}
		

	}

}
