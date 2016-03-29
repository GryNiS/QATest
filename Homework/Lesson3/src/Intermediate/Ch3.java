package Intermediate;

public class Ch3 {

	public static void main(String[] args) {
		int arr1[]={1,4,12,3,1};
		int arr2[]=new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[arr1.length-1-i];
			System.out.println(arr2[i]);
		}

	}

}
