package org.example.lvl1;

import java.util.Scanner;

public class CoverInWater {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            String str = sc.next();

            int i = 0;

            int count = 0;
            int k = 0;

            while(i < n ){

                if(str.charAt(i) == '.'){
                    count++;
                    k++;
                }
                else count = 0;
                if(count >= 3){
                    break;
                }
                i++;
            }
            if(count >= 3) System.out.println(2);
            else System.out.println(k);


        }

    }
}
