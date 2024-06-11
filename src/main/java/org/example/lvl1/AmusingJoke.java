package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {

    public static void main(String[] args) {

        Scanner sc  =  new Scanner(System.in);

        String a1 = sc.next();
        String a2 = sc.next();
        String ans = sc.next();

        String str = a1 + a2;


        char [] ch = str.toCharArray();
        char [] ch1 = ans.toCharArray();

        Arrays.sort(ch);

        Arrays.sort(ch1);


        if(Arrays.equals(ch, ch1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
