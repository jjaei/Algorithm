import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	int a = 0;
	int b = 0;
		
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	

	System.out.println(a*(b%10));
	System.out.println(a*((Math.round(b/10))%10));
	System.out.println(a*((Math.round(b/100))%100));
	System.out.println(a*b);
	
  }		
}