package org.example.div2;

import java.util.Scanner;

public class PaintingTheRibbon {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int min = (m + n - 1 )/m;

        if(min+k >= n){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }



    }
}
