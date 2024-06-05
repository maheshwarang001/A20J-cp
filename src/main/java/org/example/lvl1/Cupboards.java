package org.example.lvl1;

import java.util.Scanner;

public class Cupboards {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int [] left = new int[n];
        int [] right = new int[n];


        for(int i = 0 ; i < n ; i++){
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int l = computer(left);
        int r = computer(right);

        System.out.println(l+r);



    }


    public static int computer(int[] arr){
        int count = 0;
        for(int i = 0 ; i  < arr.length ; i++){
            if(arr[i] == 0) count++;
        }

        return Math.min(count, arr.length-count);
    }
}
