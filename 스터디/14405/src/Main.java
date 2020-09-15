
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        boolean ispika = true;
        boolean check = false;
        String src = "";
        String temp = "";

        Scanner scan = new Scanner(System.in);
        src = scan.nextLine();

        for(int i=0 ; i<src.length() ; i++){
            if(i+2<src.length()){
                temp = src.substring(i, i+3);
                if(temp.equals("chu")){
                    i += 2;
                    check = true;
                }
            }

            if(i+1 < src.length() && !check) {
                temp = src.substring(i, i + 2);
                if (temp.equals("pi") || temp.equals("ka")){
                    i++;
                }
                else{
                    ispika = false;
                    break;
                }
            }
            else if(i+1 >= src.length() && !check){
                ispika=false;
                break;
            }
            check = false;
        }

        if(ispika) System.out.println("YES");
        else System.out.println("NO");
    }
}
