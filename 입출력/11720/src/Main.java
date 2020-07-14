import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		n = scan.nextInt();
		String[] num = scan.next().split("");
		for(int i = 0 ; i<n ; i++) {
			sum += Integer.parseInt(num[i]);
		}
		System.out.print(sum);

	}

}
