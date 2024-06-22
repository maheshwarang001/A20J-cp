package org.example.bit;

import java.util.Scanner;

public class FedorAndNewGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int [] nums = new int[m+1];

        for(int i = 0 ; i < m+1 ; i++){
            nums[i] = sc.nextInt();
        }

        int fedor = nums[m];
        int count = 0;

        for(int x = 0 ; x < m ; x++){
            int differingBits = Integer.bitCount(nums[x] ^ fedor);
            if (differingBits <= k) {
                count++;
            }
        }



        System.out.println(count);
    }
}
