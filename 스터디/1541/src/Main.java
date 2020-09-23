
import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner scan = new Scanner(System.in);

        String eq = scan.nextLine();
        int flag = 0;

        for(int i=0 ; i<eq.length() ; i++){
            if(eq.charAt(i) == '-'){
                flag = i+1;
                while(eq.charAt(flag) != '-' && flag<eq.length()-1){
                    if(eq.charAt(flag) == '+'){
                        eq = eq.substring(0, flag)+'-'+eq.substring(flag+1, eq.length());
                    }
                    flag++;
                }
                i = flag-1;
            }
        }
        //System.out.println(eq);

        int anw = 0;
        flag = 0;
        int start = 0;

        //첫 숫자 저장하기
        for(int i=0 ; i<eq.length() ; i++){
            if(!Character.isDigit(eq.charAt(i))){
                anw = Integer.parseInt(eq.substring(flag, i));
                start=i;
                break;
            }
            else if(i==eq.length()-1) anw = Integer.parseInt(eq.substring(flag, eq.length()));

        }

        int temp=0;
        //식 계산
        for(int i=start ; i<eq.length() ; i++){
            if(!Character.isDigit(eq.charAt(i))){
                for(int j=i+1 ; j<=eq.length() ; j++){
                    if(j==eq.length() || !Character.isDigit(eq.charAt(j))){
                        temp = Integer.parseInt(eq.substring(i+1, j));
                        flag=j;
                        break;
                    }
                }
                if(eq.charAt(i) == '+') anw += temp;
                else anw -= temp;
                i=flag-1;
            }
        }
        System.out.println(anw);
    }
}
