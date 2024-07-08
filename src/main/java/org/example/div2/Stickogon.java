package org.example.div2;

import java.util.Arrays;
import java.util.Scanner;

public class Stickogon {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int [] nums =  new int[101];



        for(int i = 0 ; i < n ; i++){
            nums[sc.nextInt()]++;
        }

        int count = 0;
        for(int i : nums){
            count  += i/3;
        }
        System.out.println(count);


    }
}
