package org.example.lvl1;

import java.util.Scanner;

public class FlippingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int ones = 0;

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();

            if(nums[i] == 1) ones++;
        }

        int max = 0;

        int sum = 0;

        for(int i = 0; i < n ; i++){

            if(nums[i] == 0){
                sum++;

            }else{
                sum--;
            }
            max = Math.max(max,sum);

            if(sum < 0 ) sum = 0;
        }

        if(ones == n){
            System.out.println(ones-1);
        }else{
            System.out.println(max + ones);
        }

    }
}
