package aplication;

import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter radius value: ");
		double radius = scan.nextDouble();

		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.println("PI value: " + Calculator.PI);

		scan.close();

	}

}
