package org.example.bit;

import java.util.Arrays;
import java.util.Scanner;

public class LLPS {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        int[] freq = new int[27];
        Arrays.fill(freq,0);

        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i = 26 ; i >= 0 ; i--){

            if(freq[i] > 0){

                for(int j = 0 ; j < freq[i] ; j++){
                    char ans = (char)(i + 'a');
                    System.out.print(ans);
                }
                return;
            }
        }
    }
}
