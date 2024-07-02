package org.example.div2;

import java.util.*;

public class ChamoAndMochaArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int[] nums = new int[n];
            for(int i = 0 ; i < n ;i++) nums[i] = sc.nextInt();

            int max = 0;
            for(int i = 1 ; i < n ; i++){
                max = Math.max(max, Math.min(nums[i-1],nums[i]));
            }

            for(int i = 0 ; i < n-2 ; i++ ){


                int [] temp = {nums[i] , nums[i+1], nums[i+2]};

                Arrays.sort(temp);

                max = Math.max(max, temp[1]);
            }

            System.out.println(max);

        }

    }
}
