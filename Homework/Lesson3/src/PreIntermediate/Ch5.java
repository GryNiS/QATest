package PreIntermediate;

public class Ch5 {

	public static void main(String[] args) {
		int arr[] = {1,2,6,5,4,3,8};
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]==7)||(arr[i]==9)){
				flag=false;
				break;
			}
		}
		System.out.println(flag);

	}

}
