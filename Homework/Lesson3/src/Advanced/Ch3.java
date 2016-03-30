package Advanced;

import java.util.Scanner;

public class Ch3 {

	public static void main(String[] args) {
		Metrics met = new Metrics();
		System.out.println("passed number of test cases (TC)");
		Scanner sc = new Scanner(System.in);
		met.ptc = sc.nextInt();
		System.out.println("failed number of test cases (TC)");
		sc = new Scanner(System.in);
		met.ftc = sc.nextInt();
		System.out.println("complete number of unresolved issues");
		sc = new Scanner(System.in);
		met.compn = sc.nextInt();
		System.out.println("number of unresolved issues (bugs) with HIGH priority");
		sc = new Scanner(System.in);
		met.hpb = sc.nextInt();
		System.out.println("number of unresolved issues (bugs) with Blocker and Critical severity");
		sc = new Scanner(System.in);
		met.bncb = sc.nextInt();
		System.out.println(met.stable());
	}

}
