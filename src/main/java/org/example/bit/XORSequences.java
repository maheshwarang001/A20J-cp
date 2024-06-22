package org.example.bit;

import java.util.Scanner;

public class XORSequences {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            for (int i = 0; i <= 30; i++) {

                if( ((a>>i)&1) != ((b>>i)&1) ){
                    System.out.println(1L<<i);
                    break;
                }
            }
        }
    }
}
