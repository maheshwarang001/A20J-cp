package org.example.div2;

import java.util.Scanner;

public class LongMultiplication {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        String a = sc.next();
        String b = sc.next();

        String x ="";
        String y ="";
        int tgt = 0;
        for(int i = 0  ; i < a.length() ; i++){
            if(tgt == 0){

                if(a.charAt(i) == b.charAt(i)){
                    x += a.charAt(i);
                    y += a.charAt(i);
                }else if(a.charAt(i) > b.charAt(i)){
                    tgt = 1;
                    x += a.charAt(i);
                    y += b.charAt(i);
                }else{
                    tgt = 1;
                    x += b.charAt(i);
                    y += a.charAt(i);
                }
            }else{
                if(a.charAt(i) > b.charAt(i)){
                    x += b.charAt(i);
                    y += a.charAt(i);
                }else{
                    x += a.charAt(i);
                    y += b.charAt(i);
                }

            }

        }
        System.out.println(x);
        System.out.println(y);

    }
}
