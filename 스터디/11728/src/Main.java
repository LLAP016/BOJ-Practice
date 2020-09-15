
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int[] com = new int[n+m];

        for(int i=0 ; i<n ; i++) a[i] = scan.nextInt();
        for(int i=0 ; i<m ; i++) b[i] = scan.nextInt();

        int start = 0;
        int flag = 0;

        for(int i=0 ; i<n ; i++){
            if(start != m) {
                while (start < m && b[start] <= a[i]) {
                    com[flag] = b[start];
                    flag++;
                    start++;
                }
            }
            com[flag] = a[i];
            flag++;

        }
        for(int i=start ; i<m ; i++){
            com[flag] = b[i];
            flag++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<n+m ; i++){
            sb.append(com[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
