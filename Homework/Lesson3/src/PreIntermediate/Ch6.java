package PreIntermediate;

public class Ch6 {

	public static void main(String[] args) {
		int arr[] = {3,3,3,5};
		float sum=0;
		float avg;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
	}

}
