package Intermediate;

import java.util.Scanner;

public class Ch1 {

	public static void main(String[] args) {
		 int n = 12345;
		 int sum = 0;
		 System.out.println("���� ����� ����� ���� ���� ����� "+n+" ?");
		 Scanner sc = new Scanner(System.in);
		 for(n = n; n != 0; n /= 10)
			{ 
			 	sum = sum + (n % 10); 
			} 
		 int sn = sc.nextInt();
		 if (sum==sn) {
			 System.out.println("������");
		 }
		 else{
			 System.out.println("��������");
		 }
		 	
	}

}
