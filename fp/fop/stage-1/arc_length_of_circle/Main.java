import java.util.Scanner;

class Main {
	final static float PI=3.14f;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the first number");
		float radius = scan.nextFloat();
		//System.out.println("Enter the second number");
		float angle = scan.nextFloat();
		float ans = 2 * PI * radius * (angle/360);
		//System.out.println(String.format("Answer is %.2f", ans));
		System.out.println(String.format("%.2f", ans));
		
	}
}
