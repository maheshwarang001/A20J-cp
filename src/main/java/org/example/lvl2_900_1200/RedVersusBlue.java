package org.example.lvl2_900_1200;

import java.util.Scanner;

public class RedVersusBlue {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){


        int r = sc.nextInt();
        int b = sc.nextInt();


        int p = r/(b+1);

        int q = r%(b+1);

        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < (b+1-q) ; i++){

            str.append("R".repeat(Math.max(0, p)));
            str.append('B');
            
        }

        for(int i = 0 ; i < q ; i++){

            str.append("R".repeat(Math.max(0, p+1)));
            str.append('B');
        }
        str.deleteCharAt(str.length()-1);
        System.out.println(str.toString());


    }
}
