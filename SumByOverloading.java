package september24;

public class SumByOverloading {
	
	public static void main(String [] srgs) {
		
		add(23,34);
		add(23,34,23);
		add(23.0,34);
		add(45,34.65);
		add(343.90,656.5766);
		add(true, false);
		add(24,false);
		
	}
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
		}
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
		}
	
	public static void add(double a, int b) {
		System.out.println(a+b);
		}
	
	public static void add(int a, double b) {
		System.out.println(a+b);
		}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
		}
	
	
	public static void add(boolean a,  boolean b) {
		System.out.println(a+" "+b);
		}
	
	public static void add(int a, boolean b) {
		System.out.println(a+ " "+b);
		}

}
