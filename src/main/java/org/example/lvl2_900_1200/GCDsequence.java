package org.example.lvl2_900_1200;

import java.util.*;
import java.util.Scanner;

public class GCDsequence {

    public static long gcd(long a , long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();

    }

    public static boolean helper(List<Long> nums){

        int n = nums.size();

        long prev_g = gcd(nums.get(0),nums.get(1));


        for(int i = 0 ; i < n-1 ; i ++){

            long curr = gcd(nums.get(i),nums.get(i+1));

            if(prev_g > curr){
                return false;
            }

            prev_g = curr; // update prev
        }

        return true;
    }





    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        Long nums[] = new Long[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextLong();
        }

        long prev_g = gcd(nums[0],nums[1]);
        int idx_G = -1;

        for(int i = 0 ; i < n-1 ; i ++){

            long curr = gcd(nums[i],nums[i+1]);

            if(prev_g > curr){
                idx_G = i;
                break;
            }

            prev_g = curr; // update prev
        }

        //if its sorted
        if(idx_G == -1){
            System.out.println("YES");
        }else{

            List<Long> i_minus = new ArrayList<>(Arrays.asList(nums));
            List<Long> i_th = new ArrayList<>(Arrays.asList(nums));
            List<Long> i_plus = new ArrayList<>(Arrays.asList(nums));


            if(idx_G>0)i_minus.remove(idx_G-1);
            i_th.remove(idx_G);
            if(idx_G < n-1)i_plus.remove(idx_G+1);


            boolean ans = helper(i_minus) || helper(i_th) || helper(i_plus);

            System.out.println(ans?"YES":"NO");

        }
    }
}
