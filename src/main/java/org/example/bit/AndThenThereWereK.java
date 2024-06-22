package org.example.bit;

import java.util.Scanner;

public class AndThenThereWereK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            for(int i = 31 ; i >= 0 ; i--) {
                if((n & (1 << i)) != 0) {
                    int ans = (1 << i) - 1;
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
