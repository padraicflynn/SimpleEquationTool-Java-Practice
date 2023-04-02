package MathHolder;

import java.util.Scanner;

public class MathClass implements MathInterface{

	public static void main(String[] args) {
		 
		  makeAnEquation();
	}

	
	private static void makeAnEquation() {
		
		
		
// Initializing our variables 
		String k, l;
		int a, b, c, d;
// making a new scanner called userInput2 
		try(Scanner userInput2 = new Scanner (System.in)) {
		 
			
// using while true statements to ensure all user inputs are valid for our basic math		
			while (true) {
			    System.out.println("Let's make an equation. Give me three numbers and two operators.");
			    System.out.println("What is the first number?");
			    if (userInput2.hasNextInt()) {
			        a = userInput2.nextInt();
			        break;
			    } else {
			        System.out.println("Please enter a valid number.");
			        userInput2.next(); // consume invalid input
			    }
			}
			
			while (true) {
			System.out.println("What is the first operator? Please select from +, -, / and *.");
			k = userInput2.next();	
			if (k.equals("+") || k.equals("-") || k.equals("*") || k.equals("/")) { break; }
			else { System.out.println("Invalid operator, please try again.");
			}
			}
			
			while (true) {
			System.out.println("Ok, and the next number would be?");
			if (userInput2.hasNextInt()) {
			b = userInput2.nextInt();
			break;
			}else {
				System.out.println("Please enter a valid number.");
				userInput2.next();
			}}
			
			
			while (true) {
			System.out.println("And the operator is?");
			l = userInput2.next();
			if (l.equals("+") || l.equals("-") || l.equals("*") || l.equals("/")) { break; }
			else { System.out.println("Invalid operator, please try again.");
			}
		}
			
			while (true) {
				
			
			System.out.println("And the final number please.");
			if (userInput2.hasNextInt()) {
				c = userInput2.nextInt();
				break;
			}else {
				System.out.println("Please enter a valid number.");
				userInput2.next();
			}
		 }
			
// setting up each case for possible combination of operator the user inputs
			switch (k) {
			case "+":
				d = a + b;
				break;
			case "-":
				d = a - b;
				break;
			case "*":
				d = a * b;
				break;
			case "/":
				d = a / b;
				break;
			default:
				System.out.println("Invalid operator, please enter either + - / or * ");
				return;
			}
			
			 switch (l) {
				 case "+":
					 d += c;
					 break;
				 case "-":
					 d -= c;
				     break;
				 case "*":
					 d *= c;
					 break;
				 case "/":
					 d /= c;
					 break;
				default:
					System.out.println("Invalid operator, please enter either + - * or /");
					
					return;
			 }
// and finally printing the resulting equation to the console
			System.out.println("Ok, here is the equation we made: " + a + k + b + l + c +"=" + d + "\nThanks for doing some basic math! See you next time!");
			
			}
	}
	
	// warm up method, not used in later version 
	private static void divideTwoNumbers() {
	       int x, y, z;
			try (Scanner userInput = new Scanner (System.in)) {
				System.out.println("What is the first number you would like to divide?");
				x = userInput.nextInt();
				System.out.println("What is the second number you would like to divide?");
				y = userInput.nextInt();
			}
			z = (x / y);
			System.out.println("Ok, here is the division problem: " + x + " divided by " + y + " equals " + z + ". See you next time!");
}


	
//end package
}
