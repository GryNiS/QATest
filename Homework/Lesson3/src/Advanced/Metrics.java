package Advanced;

public class Metrics {
	 int ptc = 0; 	//	- passed number of test cases (TC)
	 int ftc = 0; 	//	- failed number of test cases (TC)
	 int compn = 0; 	//	- complete number of unresolved issues
	 int hpb = 0; 	//	- number of unresolved issues (bugs) with HIGH priority
	 int bncb = 0; 	//	- number of unresolved issues (bugs) with Blocker and Critical severity
	
	public String stable(){
		String s="";
		double a1=ftc,a2=ptc,a3=bncb,a4=compn;
		if ((a1/(a2+a1))>0.2){
			s+="Many failed test cases \n";
		}
		
		if (hpb>10){
			s+="Many (bugs) with HIGH priority \n";
		}

		if (a3>5){
			s+="Many (bugs) with Blocker and Critical severity \n";
		}

		if (a3/a4>0.05){
			s+="2 cents \n";
		}

		if (s.equals("")){
			s+="STABLE";
			return s;
		}
		else{
			return s;
		}
	}
	
}
