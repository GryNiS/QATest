package Intermediate;

public class Ch7 {

	public static void main(String[] args) {
		int arr[][] =  {{3,2,1},
						{10,9,8},
						{4,5,6}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
