package test;
// final variable method, variable override nahi hota hai
class Bike{  
final void run(){System.out.println("running");}  
	}  
	     
	class Honda extends Bike{  
	   void run1(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
	//final method is 