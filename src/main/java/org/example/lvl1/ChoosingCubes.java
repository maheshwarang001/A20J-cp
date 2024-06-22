package org.example.lvl1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChoosingCubes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t-- > 0){

            int n = sc.nextInt();
            int idx = sc.nextInt();
            int k = sc.nextInt();



            Integer [] nums = new Integer[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }
            int target = nums[idx-1];


            Arrays.sort(nums, Collections.reverseOrder());

            if(nums[k-1] <= target){

                if(k < n  && nums[k] == target){
                    System.out.println("MAYBE");
                }else{
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
