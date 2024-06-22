package org.example.div2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Div2_953A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int[]arr = new int[n];
            for(int j = 0 ; j < n ; j++){
                arr[j] = sc.nextInt();
            }

            if(n % 2 == 0){
                Arrays.sort(arr);
                System.out.println(arr[0] + arr[n-1]);
            }else{
                Arrays.sort(arr);
                System.out.println(arr[n-2] + arr[n-1]);
            }
        }

        sc.close();
    }
}
