package Intermediate;

import java.util.Scanner;

public class Ch1 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(n = n; n != 0; n /= 10)
			{ 
			 	sum = sum + (n % 10); 
			} 
		System.out.println(sum);

}
