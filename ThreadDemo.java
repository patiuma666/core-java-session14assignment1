//here by implementing runnable interface and using thread class we are checking whether given number is prime or not

package assignmnet14; //created package name assignment14

import java.util.Scanner;

class Prime implements Runnable{  //created the class Prime which implements runnable interface
	
	public void run(){     //here created run method which will be executed when the thread is called 
		 
		System.out.println("enter any number");  //here enter any number 
	    Scanner sc =new Scanner(System.in);
	    
	     int number = sc.nextInt();
	     
		    boolean isPrime = true;   //here we are using a boolean variable isPrime if it is true then 
		     
		 for(int orderNumber = 2; orderNumber < number/2; orderNumber++){ //here using for loop checking whether the given no. prime or not prime number is a factor of one and itself 
			                                                              //if a number is divided by 2 gives the reminder zero it is not a prime
			 if(number % orderNumber == 0){ //if the number which is divided by any number and the reminder is equals to zero  
				 
				 isPrime = false; //then it prints the isPrime as false
				 break; //here it breaks the the condition
			 }
		 }
		 if (isPrime){ //now it checks the the condition by using if else and prints the statements
			 
			 System.out.println(number + " is a prime number");
		 }
   		 
		 else{
			 System.out.println(number + " not a prime number");
		 }
		 }
	}	

 public class ThreadDemo {  //here created class ThreadDemo

	public static void main(String[] args) { //here it is main thread which is the main method
		
		 Prime prime  = new Prime();   //creating an object here 
	  
	      Thread t = new Thread(prime); //created thread which starts the runnable run method
	
	         t.start();//here it executes by using start method
	 
	}

}
