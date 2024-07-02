package org.example.lvl1;

import java.util.Scanner;

public class AleksaAndStack {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int[]nums =new int[n+1];

            nums[1] = 1;
            nums[2] = 3;
            int rd = 5;

            for(int i = 3 ; i <= n ; i++){
                if((nums[i-1] + nums[i-2]) % rd == 0){
                    rd++;
                }
                nums[i] = rd;
                rd+=2;
            }
            for (int i = 1 ; i <= n ; i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();



        }

    }
}
