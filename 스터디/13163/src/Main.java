
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String nickname;
        String[] split;
        for(int i=0 ; i<n ; i++){
            nickname = scan.nextLine();
            split = nickname.split(" ");
            split[0] = "god";
            for(int j=0 ; j<split.length ; j++){
                System.out.print(split[j]);
            }
            System.out.println();
        }
    }
}
