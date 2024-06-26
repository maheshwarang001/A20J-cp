package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            long k = sc.nextLong();

            long [] nums= new long[n];

            for(int i = 0 ; i < n ; i++) nums[i] = sc.nextLong();
            Arrays.sort(nums);

            int len = 1;
            int ans = 0;
            for(int i = 1 ; i < n  ; i++){

                if(Math.abs(nums[i] - nums[i-1]) > k){
                    len++;

                }else{
                    ans = Math.max(ans,len);

                    len = 1;

                }
            }
            ans = Math.max(ans,len);





            System.out.println(n-ans);


        }

    }
}
