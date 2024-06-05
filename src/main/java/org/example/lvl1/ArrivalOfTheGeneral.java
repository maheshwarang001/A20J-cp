package org.example.lvl1;

import java.util.Scanner;

public class ArrivalOfTheGeneral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int min = 101;
        int minIndex = -1;
        int max = -1;
        int maxIndex = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= min){
                min = nums[i];
                minIndex = i;
            }
            if(nums[i] == max){
                continue;
            }
            else if(nums[i] >= max){
                max = nums[i];
                maxIndex = i;
            }
        }


        if(min == nums[n-1] && max == nums[0]){
            System.out.println("0");

        }else {

            int moves = maxIndex + (n - 1 - minIndex);

            if (maxIndex > minIndex) {
                moves--;
            }

            System.out.println(moves);
        }
    }
}
