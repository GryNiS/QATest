package Intermediate;

public class Ch4 {

	public static void main(String[] args) {
		String str = "fgdh76ds46dsg57";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))){
				sum+=(str.charAt(i)-'0');
			}
		}
		System.out.println(sum);

	}

}
