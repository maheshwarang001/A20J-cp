package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class LightsOut {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean[][] light = new boolean[3][3];

        for(boolean []b : light) Arrays.fill(b,true);


        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){

                int toggle = sc.nextInt();

                if(toggle % 2 == 1){

                    helper(light,i,j);
                    helper(light,i+1,j);
                    helper(light,i,j+1);
                    helper(light,i-1,j);
                    helper(light,i,j-1);
                }

            }
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){

                if(light[i][j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void helper(boolean[][]light, int row, int col){

        if(row >= 0 && row < light.length && col >= 0 && col < light[0].length){
            light[row][col] = !light[row][col];
        }
    }
}
