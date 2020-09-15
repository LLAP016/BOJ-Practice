
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        String str;
        int[] letter = new int[26];
        str = scan.nextLine();

        for(int i=0 ; i<26 ; i++) letter[i] = 0;

        for(int i=0 ; i<str.length() ; i++){
            letter[str.charAt(i)-97]++;
        }

        for(int i=0 ; i<26 ; i++) System.out.printf("%d ", letter[i]);
    }
}
