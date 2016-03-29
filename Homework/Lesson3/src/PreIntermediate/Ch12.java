package PreIntermediate;

public class Ch12 {

	public static void main(String[] args) {
		 int n = 12345;
		 int sum = 0;

		for(n = n; n != 0; n /= 10)
		{ 
		    sum = sum + (n % 10); 
		} 

	}

}
