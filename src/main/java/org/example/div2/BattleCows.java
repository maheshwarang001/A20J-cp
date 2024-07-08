package org.example.div2;

import java.util.Scanner;

public class BattleCows {
    public static void swapDigit(int a, int b, int[] nums){
        int temp  = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int k  = sc.nextInt();
        k-=1;

        int[] nums =new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        int [] nums2 = nums.clone();

        //first case swap the first element
        swapDigit(0,k,nums);

        int count = 0;

        for(int i = 1 ; i < n ; i++){
            if(nums[0] > nums[i]){
                count++;

            }else{
                break;
            }
        }
        //System.out.println(count);

        //second case swap the first great number

        //first find the nth number

        int idx = 0;
        for(int i = 0 ; i < k ; i++){
            if(nums2[i] > nums2[k]){
                idx = i;
                break;
            }
        }
        //System.out.println(idx);

        swapDigit(idx,k,nums2);


            int count2 = 0;

            //now swap it


            if(idx != 0){
                count2++;
            }

            for(int i = idx+1 ; i < k ; i++){

                if(nums2[idx] > nums2[i]) count2++;
                else break;
            }

            System.out.println(Math.max(count2,count));

        }

}
