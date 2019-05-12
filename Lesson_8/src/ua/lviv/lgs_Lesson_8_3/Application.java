package ua.lviv.lgs_Lesson_8_3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		if (sc.hasNextInt()) {
			a=sc.nextInt();
		} else {
			System.out.println("Error_The number entered is not correct");
			return;
		}
		System.out.println("Enter the second number");
		if (sc.hasNextInt()) {
			b=sc.nextInt();
			System.out.println("The sum of two integers = "+(a+b));
		} else {
			System.out.println("Error_The number entered is not correct");
			
		}

	}

}
