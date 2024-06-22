package org.example.bit;

import java.util.Scanner;

public class NITorz {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){


            int n = sc.nextInt();
            long z = sc.nextInt();

            long max = 0;

            for(int i = 0  ; i < n ; i++){
                long x = sc.nextInt();

                long y  = x | z;
                max=  Math.max(y,max);
            }
            System.out.println(max);
        }
    }
}
