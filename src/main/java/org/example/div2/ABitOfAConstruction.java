package org.example.div2;

import java.util.Arrays;
import java.util.Scanner;

public class ABitOfAConstruction {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n == 1){
            System.out.println(k);
        }
        else{


            int[] arr = new int[n];
            Arrays.fill(arr,0);
            int msb = 0;
            for(int i = 1 ; i  <= 31 ; i++){
                if((k&(1<<i))!=0){
                    msb = i;
                }
            }

            arr[0] = (1<<msb)-1;
            arr[1] = k - arr[0];

            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();

        }

    }
}
