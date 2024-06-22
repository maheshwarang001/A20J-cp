package org.example.bit;

import java.util.Scanner;

public class RoofConstruction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            //first
            int max_bit = (int) (Math.log(n-1) / Math.log(2));

            int min_integer = (1 << max_bit);

            for(int i = n-1  ; i >= min_integer ; i--){
                System.out.print(i + " ");
            }
            for(int i = 0 ; i  < min_integer ; i++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
