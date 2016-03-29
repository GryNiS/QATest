package PreIntermediate;

public class Ch1 {

	public static void main(String[] args) {
		boolean he=true;
		boolean she=true;
		System.out.println(visitCinema(he,she));

	}
	
	private static boolean visitCinema(boolean he,boolean she){
		boolean v=false;
		v=(he==she)?true:false;
		return v;
	}

}
