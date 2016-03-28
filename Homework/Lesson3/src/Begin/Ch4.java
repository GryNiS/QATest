package Begin;

public class Ch4 {

	public static void main(String[] args) {
		int arr[] = {4,3,2,10,2};
		int look = 2;
		int quantity = 0;
		for (int i=0; i<arr.length;i++)
		{
			quantity=(arr[i]==look)?quantity+1:quantity;
		}
	}

}
