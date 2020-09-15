
import java.util.Scanner;

public class Main {
    int[] student;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] student = new int[n];
        for(int i=0 ; i<n ; i++){
            student[i] = scan.nextInt();
        }
        int b, c;
        b = scan.nextInt();
        c = scan.nextInt();

        long num = 0;
        for(int i=0; i<n ; i++){
            student[i] = student[i] - b;
            num++;
            if(student[i]>0) {
                if (student[i] % c == 0) num += student[i] / c;
                else num += (student[i] / c) + 1;
            }
        }
        System.out.println(num);
    }
}
