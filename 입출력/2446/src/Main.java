import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i, j;
		
		for(i = n ; i>=1 ; i--) {
			for(j=1 ; j<=n-i ; j++) System.out.print(" ");
			for(j=1 ; j<=i*2-1 ; j++) System.out.print("*");
			System.out.println();
		}
		
		for(i = 2 ; i<=n ; i++) {
			for(j=n-i ; j>=1 ; j--) System.out.print(" ");
			for(j=1 ; j<=i*2-1 ; j++) System.out.print("*");
			System.out.println();
		}

	}

}
