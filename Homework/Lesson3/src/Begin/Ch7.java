package Begin;
import java.lang.*;

public class Ch7 {

	public static void main(String[] args) {
		int arr[] = {100,2,6,200,-1,-100,10};
		int maximum=arr[0];
		for(int i = 1; i<arr.length;i++){
			maximum=(maximum>arr[i])?maximum:arr[i];
		}
	}

}
