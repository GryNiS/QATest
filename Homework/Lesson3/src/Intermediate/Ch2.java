package Intermediate;

import java.util.Scanner;

public class Ch2 {

	public static void main(String[] args) {
		int raz = 0;
		int sum1 = 0;
		int sum2 = 0;
		int n = 0;
		for (int j = 1; j <= 999999; j++){

			sum1 = 0;
			sum2 = 0;
			n=j;
			for (int i = 0; i < 3; i++) {
				sum1 = sum1 + (n % 10);
				n=n/10;
			}
			for (int i = 0; i < 3; i++) {
				sum2 = sum2 + (n % 10);
				n=n/10;
			}
			if (sum1==sum2){
				raz++;
			}
		}
		System.out.println(raz);
	}

}
