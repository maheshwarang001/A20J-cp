package org.example.bit;

import java.util.Scanner;

public class MinOrSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            long n = sc.nextLong();
            long ans = 0;
            for(int i = 0 ; i < n ; i++){
                ans ^= sc.nextLong();
            }
            if (n%2==0)
            {
                if (ans==0)
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(-1);
                }
            }
            else
            {
                System.out.println(ans);
            }



        }

    }
}
