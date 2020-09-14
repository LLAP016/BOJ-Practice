import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t, n, w, h;
        int floor, room;

        t = scan.nextInt();
        for(int i=1 ; i<=t ; i++){
            h = scan.nextInt();
            w = scan.nextInt();
            n = scan.nextInt();

            floor = n%h;
            room = n/h+1;

            if(floor == 0){
                floor = h;
                room = n/h;
            }
            System.out.println(floor*100+room);
        }

    }

}
