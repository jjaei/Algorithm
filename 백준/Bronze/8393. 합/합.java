import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			sum += i+1;
		}
		System.out.println(sum);
	}

}