package org.example.lvl2_900_1200;

import java.util.Scanner;

public class GoodPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long max = 0;
            int count=0;

            long nums[] =new long[n];
            for(int i = 0 ; i < n ; i++) nums[i] = sc.nextLong();

            for (int i = 0; i < n; i++) {

                max = Math.max(max,nums[i]);
                sum += nums[i];

                if(max == sum - max){
                    count++;
                }

            }
            System.out.println(count);


        }
    }
}
