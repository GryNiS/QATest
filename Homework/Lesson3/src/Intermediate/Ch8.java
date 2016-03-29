package Intermediate;

import java.util.Scanner;

public class Ch8 {

	public static void main(String[] args) {
		System.out.println("¬ведите верблюжью строку:");
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		System.out.print(Character.toUpperCase(ch[0]));
		for (int i = 1; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])){
				System.out.print(" "+Character.toLowerCase(ch[i]));
			}
			else{
				System.out.print(ch[i]);				
			}
		}

	}

}
