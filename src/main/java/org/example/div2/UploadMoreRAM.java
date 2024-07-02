package org.example.div2;

import java.util.Scanner;

public class UploadMoreRAM {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            if(k == 1){
                System.out.println(n*k);
                continue;
            }
            int steps=1;
            n--;
            while(n!=0){
                steps = steps+k;
                n--;
            }
            System.out.println(steps);


        }

    }
}
