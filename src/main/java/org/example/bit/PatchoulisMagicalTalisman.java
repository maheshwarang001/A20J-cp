package org.example.bit;

import java.util.Scanner;

public class PatchoulisMagicalTalisman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int odd = 0;
            int even = 0;
            int min = (int)1e9+1;

            while(n-- > 0){

                int x = sc.nextInt();

                if((x&1) != 0){
                    //odd
                    odd++;
                }else{

                    even++;
                    int count = 0;
                    while( (x&1) == 0){
                        count++;
                        x = x >> 1; // half it
                    }
                    min = Math.min(min ,count);
                }
            }

            if(odd > 0){
                System.out.println(even);
            }else{

                int ans = min + (even-1);
                System.out.println(ans);
            }

        }
    }
}
