package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sideA;
		int sideB;
		int sideC;
		
		System.out.println("Please enter side A value: ");
		sideA = sc.nextInt();
		System.out.println("Please enter side B value: ");
		sideB = sc.nextInt();
		System.out.println("Please enter side C value: ");
		sideC = sc.nextInt();
		
		if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
			System.out.println("Triangle witр such parameters doesn't exist !");
		} else {
			System.out.println("Such triangle exists !");
		}
				
	}

}
