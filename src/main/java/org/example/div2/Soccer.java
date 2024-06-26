package org.example.div2;

import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }
    public static void swap(long a, long b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            long x1 = sc.nextInt();
            long y1 = sc.nextInt();


            long x2 = sc.nextInt();
            long y2 = sc.nextInt();

            if(x1 > y1){

                long temp = x1;
                x1 = y1;
                y1 = temp;

                temp = x2;
                x2 = y2;
                y2 = temp;

            }

            if(x1 < y1 && x2 > y2 ){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }






        }
    }
}
