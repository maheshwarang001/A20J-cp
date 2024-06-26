package org.example.lvl1;

import java.util.Scanner;

public class NotDividing {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            long prev = 0;

            for(int i = 0 ; i < n ; i++){

                long c = sc.nextLong();
                if(c == 1) c++;
                if(i == 0){
                    prev = c;
                }else{

                    if(c%prev == 0){
                        c++;
                    }

                    prev = c;
                }

                System.out.print(c + " ");

            }
            System.out.println();


        }

    }

}
