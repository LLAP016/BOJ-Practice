import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int sum = y;
		for(int i = 1 ; i<=12 ; i++) {
			if(x == i) break;
			sum += days[i];
		}
		switch(sum%7) {
		
			case 1: System.out.print("MON"); break;
			case 2: System.out.print("TUE"); break;
			case 3: System.out.print("WED"); break;
			case 4: System.out.print("THU"); break;
			case 5: System.out.print("FRI"); break;
			case 6: System.out.print("SAT"); break;
			case 0: System.out.print("SUN"); break;
			default: System.out.print("ERROR");
		
		}

	}

}
