import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int max = -1000001;
		int min = 10000001;
		int temp;
		for(int i = 1 ; i<=n ; i++) {
			temp = scan.nextInt();
			if(temp>max) max = temp;
			if(temp<min) min = temp;
		}
		System.out.printf("%d %d", min, max);
	}

}
