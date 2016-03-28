package Begin;

public class Ch8 {
	public static void main(String[] args){
		String s="Testing";
		int n = 4;
		s=costraciya(s,n);
		System.out.println(s);
	}
	

	
	public static String costraciya(String s1,int n1) {

	    char[] s2=s1.toCharArray();
		s1="";
	    for(int i=0;i<s2.length;i++){
		    for(int j=0;j<n1;j++){
		    	s1+=s2[j];
		    }
		    n1-=1;
	    }
	    return s1;
	}
	


}
