package Intermediate;

public class Chos {
int z;
	double toGradus(double a){
		a-=273.15;
		if (a<-545,3){
		System.out.println("Less absolute zero");
		}
		return a;
	}
	
	double toKelvin(double a){
		a+=273.15;
		if (a<-273.15){
		System.out.println("Less absolute zero");
		}
		return a;
	}

}
