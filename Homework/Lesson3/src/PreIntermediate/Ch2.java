package PreIntermediate;

public class Ch2 {

	public static void main(String[] args) {
	    System.out.println(swapChar("add"));

	}
	
	private static String swapChar(String s){
	    char[] ch=s.toCharArray();
	    char swap=ch[0];
	    ch[0]=ch[ch.length-1];
	    ch[ch.length-1]=swap;
	    s=String.valueOf(ch);
	    return s;
	}

}
