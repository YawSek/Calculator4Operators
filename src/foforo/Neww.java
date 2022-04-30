package foforo;

import java.util.Scanner;

public class Neww {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Select: " + "(a) to add " + "(s) to subtract " + "(m) to multiply " + "(d) to divide: " );
		String operator = input.next().toLowerCase();
		
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		
		if (operator.equals("a")) {
			int addResults = (num1 + num2);
			System.out.println("Answer: " + addResults);
		}else if (operator.equals("s")) {
			int subResults = (num1 - num2);
			System.out.println("Answer: " + subResults);
		}else if (operator.equals("m")) {
			int mulResults = (num1 * num2);
			System.out.println("Answer: " + mulResults);
		}else if (operator.equals("d")) {
			float divResults = (num1 / num2);
			System.out.println("Answer: " + divResults);
		}else 
			System.out.println("Enter (a) to add, (s) to subtract, (m) to multiply or (d) to divide");
		}

}
