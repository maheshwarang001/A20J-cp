package org.example.div3;

import java.util.Scanner;

public class MatrixStabilization {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] nums = new int[m][n];

            for(int i =0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    nums[i][j] = sc.nextInt();
                }
            }

            for(int i = 0 ; i < m ; i++){
                for(int j = 0; j < n ; j++){



                    if(checker(i,j,nums) == true){
                        int value = maxer(i,j,nums);
                        nums[i][j] = value;
                    }
                }
            }


            for(int i = 0 ; i < m ; i++){
                for(int j = 0; j < n ; j++){
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

    public static boolean checker(int i, int j, int[][] nums) {
        boolean flag = true;

        // down
        if (i < nums.length - 1 && nums[i][j] <= nums[i + 1][j]) {
            flag = false;
        }
        // up
        if (i > 0 && nums[i][j] <= nums[i - 1][j]) {
            flag = false;
        }
        // left
        if (j > 0 && nums[i][j] <= nums[i][j - 1]) {
            flag = false;
        }
        // right
        if (j < nums[0].length - 1 && nums[i][j] <= nums[i][j + 1]) {
            flag = false;
        }

        return flag;
    }

    public static int maxer(int i, int j, int[][] nums) {
        int max = Integer.MIN_VALUE;

        // down
        if (i < nums.length - 1) {
            max = Math.max(max, nums[i + 1][j]);
        }
        // up
        if (i > 0) {
            max = Math.max(max, nums[i - 1][j]);
        }
        // left
        if (j > 0) {
            max = Math.max(max, nums[i][j - 1]);
        }
        // right
        if (j < nums[0].length - 1) {
            max = Math.max(max, nums[i][j + 1]);
        }

        return max;
    }


}
