package org.example.lvl1;

import java.util.Scanner;

public class Chemistry {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            String str = sc.next();

            int[] freq = new int[26];
            for(char ch : str.toCharArray()){
                freq[ch-'a']++;
            }

            int c= 0;

            for(int it : freq){
                if(it%2==1) c++;
            }
            if(c <= k+1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


        }

    }
}
