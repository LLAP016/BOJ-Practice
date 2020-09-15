
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int num = 0;
        int[] len = {64, 32, 16, 8, 4, 2, 1};

        while(x>0){
            for(int i=0 ; i<6 ; i++){
                if(x>=len[i]){
                    x -= len[i];
                    num++;
                }
            }
            if(x==1) {
                num++;
                x = 0;
            }
        }
        System.out.println(num);
    }
}
