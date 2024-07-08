package org.example.div2;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class TurtleTenacity {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);

        sc.close();


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        int [] nums = new int[n];

        int min =(int)1e9;

        Map<Integer,Integer> map  = new HashMap<>();

        for(int i  = 0 ; i < n ;i++){
            nums[i] = sc.nextInt();

            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);

            min = Math.min(min,nums[i]);
        }
        int c = map.get(min);
        map.clear();

        if(c == 1){
            System.out.println("YES");
        }else{

            int flag = 0;

            for(int i = 0 ; i  < n ; i++){
                if(nums[i] % min != 0) {
                    flag = 1;
                }
            }

            if(flag == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}