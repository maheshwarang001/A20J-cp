package org.example.div2;

import java.util.Scanner;

public class IncreaseDecreaseCopy {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){


            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n+1];

            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n+1 ; i++){
                b[i] = sc.nextInt();
            }

            long count = 0;
            int last = b[n];
            long max = Long.MAX_VALUE;
            for(int i = 0 ; i < n ; i++){

                count += Math.abs(a[i] - b[i]);

                if((last >= a[i] && last <= b[i]) || (last <= a[i] && last >= b[i])){
                    max = 0;
                }
                max = Math.min(max, Math.abs(last - a[i]));
                max = Math.min(max, Math.abs(last - b[i]));
            }


            System.out.println(count+max+1);





        }

    }
}
