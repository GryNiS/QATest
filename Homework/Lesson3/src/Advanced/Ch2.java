package Advanced;

public class Ch2 {

	public static void main(String[] args) {
		int arab= 2015;
		String Rom = "";
		if (arab>=0&&arab<2016){
			int tys = arab/1000;
			int sot = (arab%1000)/100;
			int des = (arab%100)/10;
			int ed = arab%10;
			for (int i = 0; i < tys; i++) {
				Rom+="M";
			}
			int d=sot/5;
			for (int i = 0; i < d; i++) {
				Rom+="D";
			}
			for (int i = 0; i < sot-5*d; i++) {
				Rom+="C";
			}
			int l=des/5;
			for (int i = 0; i < l; i++) {
				Rom+="L";
			}
			for (int i = 0; i < des-5*l; i++) {
				Rom+="X";
			}
			if (ed!=9){
				if (ed>=5){
					Rom+="V";
					for (int i = 0; i < ed-5; i++) {
						Rom+="I";
					}
				}
				else{
					Rom+=(ed==4)?"IV":"";
					if(ed<4){
						for (int i = 0; i < ed; i++) {
							Rom+="I";
						}
					}
					
				}
			}
			else{
				Rom+="IX";
			}
			System.out.println(Rom);
		}

	}

}
