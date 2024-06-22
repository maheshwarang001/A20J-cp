package org.example.bit;

import java.util.Scanner;

public class RaisingBacteria {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = Integer.bitCount(x);

        System.out.println(ans);


    }

}
