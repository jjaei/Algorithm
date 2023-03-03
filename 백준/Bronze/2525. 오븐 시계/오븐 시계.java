import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		int mm = (h * 60 ) + m + s;
		int resulth = (mm / 60) % 24;
		int resultm = mm % 60;
		
	
			System.out.println(resulth + " " + resultm);
		
	}

}