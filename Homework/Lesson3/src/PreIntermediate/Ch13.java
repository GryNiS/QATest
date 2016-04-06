package PreIntermediate;

public class Ch13 {

	public static void main(String[] args) {
		double a=2,b=0,c=1;
		double d=0;
		double x=0,x1=0,x2=0;
		d=b*b-4*a*c;
		if (d>=0){
			x1=(-b+Math.sqrt(d))/(2*a);
			System.out.println("x1 = "+x1);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("x2 = "+x2);
		}
		if (d<0){
			System.out.println("D < 0");
		}
	}

}
