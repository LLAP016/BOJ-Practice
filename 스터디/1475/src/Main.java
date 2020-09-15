
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        String room = scan.nextLine();
        int[] num = new int[10];
        int max = -1;

        for(int i=0 ; i<room.length() ; i++){
            num[room.charAt(i)-'0']++;
        }
        num[6] = (num[6]+num[9]+1)/2;
        for(int i=0 ; i<9 ; i++){
            max = Math.max(num[i], max);
        }
        System.out.println(max);
    }
}
