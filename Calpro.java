package calculatorPro;

import java.util.Scanner;

public class Calpro {

	public static void main(String[] args) {
		
    int num1,num2;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 1st Number: ");
    
    num1 = sc.nextInt();
    
    System.out.println("Enter 2nd Number: ");

    num2 = sc.nextInt();
    
    System.out.println("Enter operator: ");
    
    char operation = sc.next().charAt(0);
    
    if (operation ==  '+') {

System.out.println("sum = " + (num1 + num2));
    }

    else if(operation ==  '-') {
    	
System.out.println("subtraction = " + (num1 - num2));
    }
    
    else if(operation ==  '*') {

System.out.println("multiplication = " + (num1 * num2));
    }
    
    else if(operation ==  '%') {

    	System.out.println("modulus = " + (num1 % num2));
    	    }
    
    else if(operation ==  '/') {

System.out.println("division = " + (num1 / num2));
    }
    
    else
    	
    	System.out.println("Please enter appropriate operator e.g '+ , - , * , /' ");

	}

}
