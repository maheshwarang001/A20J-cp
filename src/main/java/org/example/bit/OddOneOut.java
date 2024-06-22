package org.example.bit;

import java.util.Scanner;

public class OddOneOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int u = 0;

            for(int i = 0; i  < 3 ; i++){
                u ^= sc.nextInt();
            }

            System.out.println(u);
        }
    }
}
