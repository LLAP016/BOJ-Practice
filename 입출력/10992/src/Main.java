import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		int n = scan.nextInt();
		
		for(i=1 ; i<=n-1 ; i++) {
			for(j=n ; j>i ; j--) System.out.print(" ");
			for(j=1 ; j<=i*2-1 ; j++) {
				if(j == 1 || j == i*2-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(i=1 ; i<=2*n-1 ; i++) System.out.print("*");
	}

}
