package PreIntermediate;

public class Ch14 {

	public static void main(String[] args) {
		String s = "Test";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
		}

	}

}
