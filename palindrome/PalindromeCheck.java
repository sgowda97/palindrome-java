package palindrome;

import java.util.Scanner;

public class PalindromeCheck {
	
	static void checkInt() {
		
		Scanner sc = new Scanner(System.in);
		int n,rem,sum=0,temp;
		
		System.out.println("Enter the number to check for palindrome:");
		n = sc.nextInt();
		temp=n;    
		while(n>0){    
			rem=n%10;  //getting remainder  
			sum=(sum*10)+rem;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println(temp+" is a palindrome");    
		else    
			System.out.println(temp+" is not a palindrome");
		
		sc.close();
		
	}
	
	static void checkString() {
		
		Scanner sc = new Scanner(System.in);
		String original,reverse = "";
		
		System.out.println("Enter the string to check for palindrome:");
		original = sc.nextLine();
		
		for(int i = original.length() - 1; i >= 0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println(original+" is a palindrome");
		else
			System.out.println(original+" is not a palindrome");
		
		sc.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int caseNum;

		System.out.println("1. Check palindrome on an integer");
		System.out.println("2. Check palindrome on a string");
		System.out.println("Enter option:");
		caseNum = sc.nextInt();
		
		switch(caseNum) {
		
		case 1: checkInt();
		break;
		
		case 2: checkString();
		break;
		
		default: System.out.println("Invalid choice!! Exiting...");
		break;
		}
		
		sc.close();

	}

}