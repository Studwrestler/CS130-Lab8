package lab8;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double s = n1+n2+n3+n4+n5;
		double a =s/5;
		System.out.println("The sum of 5 numbers is: "+ s);
		System.out.println("The average is: "+ a);
	}

}
