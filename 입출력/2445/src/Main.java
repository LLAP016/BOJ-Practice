import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		int n = scan.nextInt();
		
		for(i = 1 ; i<=n ; i++) {
			for(j = 1 ; j<=i ; j++) System.out.print("*");
			for(j=n-1 ; j>=i ; j--) System.out.print("  ");
			for(j=1 ; j<=i ; j++) System.out.print("*");
			System.out.println();
		}
		
		for(i=n-1 ; i>=1 ; i--) {
			for(j=i; j>=1 ; j--) System.out.print("*");
			for(j=1 ; j<=n-i ; j++) System.out.print("  ");
			for(j=i ; j>=1 ; j--) System.out.print("*");
			System.out.println();
		}

	}

}
