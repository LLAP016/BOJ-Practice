
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        int[][] t = new int[n][2];
        for(int i=0 ; i<n ; i++){
            t[i][0] = scan.nextInt();
            t[i][1] = scan.nextInt();
        }

        Arrays.sort(t, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int cnt = 0;
        int end = -1;
        for (int i =0 ; i<n ; i++){
            if(t[i][0]>=end){
                end = t[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
