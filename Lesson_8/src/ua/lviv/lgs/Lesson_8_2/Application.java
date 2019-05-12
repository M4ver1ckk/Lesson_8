package ua.lviv.lgs.Lesson_8_2;

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		if (sc.hasNextInt()) {
			int i=sc.nextInt();
			System.out.println((i%2==0) ? "The number is even":"The number is not even");
		} else {
			System.out.println("Error_The number entered is not correct");
		}


	}

}
