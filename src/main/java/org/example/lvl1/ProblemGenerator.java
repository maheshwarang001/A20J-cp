package org.example.lvl1;

import java.util.Scanner;

public class ProblemGenerator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t-- > 0){

            int n = sc.nextInt();
            int rounds = sc.nextInt();

            int freq [] = new int[7];

            String str = sc.next();

            for(char ch : str.toCharArray()){
                freq[ch-'A']++;
            }

            int count = 0;

            for(int i : freq){
                if( i < rounds){
                    count += rounds-i;
                }
            }
            System.out.println(count);
        }
    }
}
