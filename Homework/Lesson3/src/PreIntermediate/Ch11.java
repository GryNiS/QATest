package PreIntermediate;

public class Ch11 {

	public static void main(String[] args) {
		int arr[] = {1,2};
		boolean flag = false;
		if (arr.length>2) {
			for (int i = 0; i < arr.length-2; i++) {
				if ((arr[i]==1)&&(arr[i+1]==2)&&(arr[i+2]==3)){
					flag=true;
					break;
				}
			}
		}
	}

}
