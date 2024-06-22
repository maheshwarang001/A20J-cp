package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class ApplemanAndCardGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        String str = sc.next();

        long [] freq = new long[26];

        //freq has been stored
        for(int i = 0; i < n ; i++){
            freq[str.charAt(i) - 'A']++;
        }
        //sort the freq arr

        Arrays.sort(freq);
        long ans = 0;
        for(int i = 25 ; i >= 0 ; i--){

            if(k >= freq[i]){

                k -= freq[i];
                ans += freq[i] * freq[i];

            }else{
                ans += k * k;
                break;
            }
        }
        System.out.println(ans);
    }
}
