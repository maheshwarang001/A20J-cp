package org.example.div2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivisibility {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        int [] nums = new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = i+1;
        }


        for(int i = 0 ; i  < n ; i++){

            //range
            int k = i+1;

            int sum = 0;
            for(int j = 0 ; j < n ; j++){
                //System.out.print(j + " " + k);

                if( j+1 % k != 0 ) {
                    nums[j] = (nums[j] * k) % (int) 1e5;
                    sum+=nums[j];
                }


            }
            System.out.println(sum % k);

        }
        for(int i : nums) System.out.print(i+ " ");
        System.out.println();

    }


}
