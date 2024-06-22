package org.example.bit;

import java.util.Scanner;

public class SumInBinaryTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            long n = sc.nextLong();
            long sum = 0;
            while(n != 1){
                sum += n;
                n = n/2;
            }

            System.out.println(sum+1);
        }
    }
}
