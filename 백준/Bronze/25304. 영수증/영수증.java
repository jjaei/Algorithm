import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int item = sc.nextInt();
		int totalA = 0 , itemB = 0, sum = 0; 
		for(int i=0; i<item; i++) {
			totalA = sc.nextInt();
			itemB = sc.nextInt();
			sum += totalA * itemB; 
		}
		if(sum==total) {
			System.out.println("Yes");
		} else if(sum!=total) {
			System.out.println("No");
		}
		
	}
}