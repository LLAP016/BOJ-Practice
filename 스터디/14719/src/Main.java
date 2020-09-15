
import java.util.Scanner;

public class Main {
    int[] water;

    static int findMax(int[] water, int start, int end, int max){
        for(int i = start ; i<=end ; i++){
            max = Math.max(water[i], max);
        }
        return max;
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int[] water = new int[w];
        int cnt = 0;

        for(int i=0 ; i<w ; i++){
            water[i] = scan.nextInt();
        }
        for(int i=1 ; i<w-1 ; i++){
            int rightmax = findMax(water, 0, i, 0);
            int leftmax = findMax(water, i+1, w-1, 0);
            int min = Math.min(rightmax, leftmax);
            if(min - water[i]>0) cnt += min-water[i];
        }
        System.out.println(cnt);
    }
}
