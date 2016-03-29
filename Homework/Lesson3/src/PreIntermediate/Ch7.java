package PreIntermediate;

public class Ch7 {

	public static void main(String[] args) {
		int arr[] = {3,3,-10,3,5,21,2};
		int max=arr[0];
		int min=arr[0];
		int imax=0;
		int imin=0;
		for (int i = 1; i < arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
				imin=i;
			}
			if (max<arr[i]) {
				max=arr[i];
				imax=i;
			}
		}
		arr[imax]=max*2;
		arr[imin]=min*2;
	}

}
