package org.example.div2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShiftsAndSorting {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        char [] nums = sc.next().toCharArray();

        int j = 0;

        long cost = 0;

        Queue<Integer> q = new LinkedList<>();

        while(j < nums.length){

            if(nums[j] == '0' && !q.isEmpty()){

                int val = q.poll();
                swap(val, j, nums);
                cost += j - val + 1;
                q.add(j);

            }else if(nums[j] == '1'){
                q.add(j);
            }

            j++;

        }
        System.out.println(cost);


    }

    static void swap(int i, int j, char[] nums){
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}

