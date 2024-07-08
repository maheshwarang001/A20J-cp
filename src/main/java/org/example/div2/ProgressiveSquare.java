package org.example.div2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgressiveSquare {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[][] nums = new int[n][n];

        int first =  (int) 1e9;


        Map<Integer, Integer> map = new HashMap<>();

        for(int i  = 0 ; i < n*n ; i++){

            int val = sc.nextInt();
            map.put(val, map.getOrDefault(val,0)+1);
            first = Math.min(first,val);
        }

        for(int i = 0 ; i < n ; i++){

            if(i == 0){
                nums[0][0] = first;
            }
            if(i < n-1){
                nums[i+1][0] = nums[i][0]  + c;
            }
            for(int j = 1 ; j < n ; j++){
                nums[i][j] = nums[i][j-1] + d;
            }
        }
//        for(int[] it:nums){
//            System.out.println(Arrays.toString(it));
//        }

        int flag = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j =  0 ; j < n ; j++){

                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j] , map.get(nums[i][j])-1);
                    if(map.get(nums[i][j]) == 0){
                        map.remove(nums[i][j]);
                    }
                }else{
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag == 1) break;
        }

        if(flag == 0 ) System.out.println(map.isEmpty()?"YES":"NO");


    }
}
