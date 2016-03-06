public class Butterfly {
	private int age;
	private int weight;
	public String type;
	public String color;
	public int number_of_legs;
	public int number_of_wings;
	public int number_of_antennae;
	public int number_of_eyes;	
	public String name;
	public String nature;
	public boolean cyclone=false;
	
	private void flit() {}
	public void pollinate() {}
	private void eat () {}
	private void drink() {}
	private void sniff() {}
	private void fly () {}
	public boolean createCyclone(boolean cyclone) {
				cyclone=true; return cyclone;}
	private void crawl() {}
	private void sleep () {}
	private int grow(int age) {return age+1;}
}
