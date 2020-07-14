import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] word = scan.next().split("");
		int len = word.length;
		
		for(int i = 0 ; i<word.length/10+1 ; i++) {
			if(len>=10) {
				for(int j = 0 ; j<10 ; j++) {
					System.out.print(word[j+(10*i)]);
				}
				len = len-10;
				System.out.println();
			}
			else {
				for(int j = 10*i ; j<word.length ; j++) {
					System.out.print(word[j]);
				}
			}
		}

	}

}
