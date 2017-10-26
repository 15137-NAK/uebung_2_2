package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;	
		
		double links= ((a+b)*(a+b));
		double rechts= (Math.pow(a, 2)+ (2*a*b)+ Math.pow(b, 2));
		
		System.out.println("links= "+links+" und rechts "+rechts);
		
	}

}
