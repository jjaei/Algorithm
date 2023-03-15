import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i=0; i<num; i++) {
		nums[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		int sum = 0;

		for(int i=0; i<num; i++) {
			if(nums[i]==n)
			sum++;
		}
		
		System.out.println(sum);
	}
}