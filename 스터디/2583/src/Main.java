
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] check;
    static int n, m, l, s;

    static void dfs(int board[][], int x, int y){
        s++;
        int nx, ny;
        check[x][y] = true;
        for(int i=0 ; i<4 ; i++){
            nx = dx[i]+x;
            ny = dy[i]+y;
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(board[nx][ny] == 0 && !check[nx][ny]){
                    dfs(board, nx, ny);
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        l = scan.nextInt();

        int[][] board = new int[n][m];
        check = new boolean[n][m];
        ArrayList<Integer> size = new ArrayList<Integer>();
        int cnt = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                board[i][j] = 0;
            }
        }

        for(int i = 0 ; i<l ; i++){
            int lx = scan.nextInt();
            int ly = scan.nextInt();
            int rx = scan.nextInt();
            int ry = scan.nextInt();

            for(int j = ly ; j<ry ; j++){
                for(int k = lx ; k<rx ; k++){
                    board[j][k]++;
                }
            }
        }
        
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                if(board[i][j] == 0 && !check[i][j]){
                    s = 0;
                    dfs(board, i, j);
                    size.add(s);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(size);
        for(int i=0 ; i<cnt ; i++) System.out.printf("%d ", size.get(i));

    }
}
