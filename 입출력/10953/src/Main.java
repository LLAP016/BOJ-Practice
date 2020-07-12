import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			String[] num = scan.next().split(",");
			System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
		}

	}

}
