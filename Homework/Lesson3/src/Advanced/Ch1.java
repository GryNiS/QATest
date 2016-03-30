package Advanced;

import java.util.Random;

public class Ch1 {

	public static void main(String[] args) {
	    Random r = new Random();
	    String alphabet = "1234567890";
	    char[] m = new char[26];
	  	for (int i=0; i< 26; i++) {
	  	  m[i] = (char)('a' + i);
	  	alphabet+=m[i];
	   	}
	    char[] ch = new char[r.nextInt(7)+8];
	    int number = r.nextInt(ch.length-1);
	    int upper = r.nextInt(ch.length-1);
	    if (number==upper){
	    	number=(upper!=0)?number-1:number+1;
	    }
	    for (int i = 0; i < ch.length; i++) {
	    	if (i==upper){
	    		ch[i]=(char)('a' + r.nextInt(25));
	    		ch[i]=Character.toUpperCase(ch[i]);
	    	}
	    	if (i==number){
	    		ch[i]=alphabet.charAt(r.nextInt(9));
	    	}
	    	if ((i!=number)&&(i!=upper)){
			ch[i]=alphabet.charAt(r.nextInt(alphabet.length()));
	    	}
			System.out.print(ch[i]);
		}

	}

}
