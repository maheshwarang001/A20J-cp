package org.example.lvl2_900_1200;

import java.util.Scanner;

public class Game01 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){

        String str = sc.next();

        int j= 0;
        int n = str.length();
        //int flag = 1;

        int one = 0;
        int zero =0 ;

        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == '1') {
                one++;
            }else{
                zero++;
            }
        }


        if(Math.min(zero,one) % 2 == 1) System.out.println("DA");
        else System.out.println("NET");




    }
}
