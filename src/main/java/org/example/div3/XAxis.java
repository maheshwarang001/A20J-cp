package org.example.div3;

import java.util.Scanner;

public class XAxis {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = (int) 1e9;
            int x = -1;

            int range = a+b+c;

            for(int i = 0 ; i < range ; i++){

                int ans = Math.abs(a-i)+ Math.abs(b-i)+ Math.abs(c-i);

                if(ans < max){
                    x = ans;
                    max= ans;
                }
            }
            System.out.println(x);

        }

    }
}
