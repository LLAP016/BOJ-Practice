package com.company;
import java.util.Scanner;

public class Main {

    static int ispalin(String pal){
        int check = 0;
        int len = pal.length()-1;
        for(int i=0 ; i<pal.length()/2 ; i++){
            if(check!=0) break;
            if (pal.charAt(i) != pal.charAt(len - i)) {
                //회문이 아니다
                if(pal.charAt(i) == pal.charAt(len-i-1)){
                    // 오른쪽 문자를 삭제했더니 문자 두 개가 같음
                    len--;
                    for(int j=i ; j<(pal.length()+1)/2 ; j++){
                        if (pal.charAt(j) != pal.charAt(len - j)) {
                            check++;
                            break;
                        }
                    }
                    len++;

                }
                else check++;


                if(pal.charAt(i+1) == pal.charAt(len-i)){
                    i++;
                    for(int j=i ; j<(pal.length()+1)/2 ; j++){
                        if (pal.charAt(j) != pal.charAt(len - j+1)) {
                            check++;
                            break;
                        }
                    }
                }
                else check++;
            }
        }
        if(check>2) check =2;
        return check;
    }

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palin = "";
	    int palincheck = 0;
	    int t = scan.nextInt();
	    scan.nextLine();

	    for(int i=0 ; i<t ; i++){
	        palin = scan.nextLine();
	        palincheck = ispalin(palin);
	        System.out.println(palincheck);
        }
    }
}
