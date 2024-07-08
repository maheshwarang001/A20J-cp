package org.example.div2;

import java.util.Scanner;

public class PermutationPrinting {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        int l = 1;
        int r = n;

        for(int i = 1 ; i <= n ; i++){

            if( (i & 1) == 1){
                System.out.print(l+ " ");
                l++;
            }else{
                System.out.print(r+ " ");
                r--;
            }

        }
        System.out.println();
    }
}
