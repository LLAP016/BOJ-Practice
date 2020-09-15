
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long fibo(int n, long[] fiboarr){
        if(n==1) return 1;
        else if(n==0) return 0;
        if(fiboarr[n] != -1) return fiboarr[n];
        fiboarr[n] = fibo(n-1, fiboarr) + fibo(n-2, fiboarr);
        return fibo(n-1, fiboarr) + fibo(n-2, fiboarr);
    }

    public static void main(String[] arg){
        long[] fiboarr = new long[100];
        Arrays.fill(fiboarr, -1);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long num = fibo(n, fiboarr);
        System.out.println(num);
    }
}
