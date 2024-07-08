package org.example.lvl2_900_1200;

import java.util.Scanner;

public class ThreeIndices {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0 ; i < n ; i++)nums[i] = sc.nextInt();

        int flag = 0;

        for(int i = 0 ; i < n-2 ; i++){

            int j = i+1;
            int k = n-1;

            while(j < k){

                if(nums[i] < nums[j] && nums[j] > nums[k] ) {
                    flag = 1;
                    System.out.println("YES");
                    System.out.println((i+1) + " "+ (j+1) + " "+ (k+1));
                    break;
                }
                k--;

            }
            if(flag == 1) break;
        }

        if(flag == 0) System.out.println("NO");

    }
}
