
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] rice = new int[n];

        for(int i=0 ; i<n ; i++) rice[i] = scan.nextInt();

        int start = 0;
        int end = -1;
        for(int i=0 ; i<n ; i++){
            if(rice[i]>end) end = rice[i];
        }

        int mid = 0;
        long sum = 0;
        long result = 0;
        while(start<=end){
            mid = (start+end)/2;
            for(int i=0 ; i<n ; i++){
                if(rice[i]>mid) sum += rice[i]-mid;
            }
            if(sum == m){
                result = mid;
                break;
            }
            else if(m>sum) end = mid-1;
            else {
                result = mid;
                start = mid+1;
            }

            sum = 0;
        }
        System.out.println(result);
    }

}
