package org.example.div2;

import java.util.Scanner;

public class BinaryCut {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        String str = sc.next();

        char [] nums = str.toCharArray();

        char prev = nums[0];

        int count = 0;

        for(int i = 1 ; i < nums.length ; i++){

            if(prev!=nums[i])count++;

            prev = nums[i];
        }

        System.out.println(count + (str.contains("01")?0:1));

    }
}
