package org.example.lvl1;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char []  ch =  str.toCharArray();


        if(ch.length > 0 && ch[0] >= 'a' && ch[0] <= 'z' ){
            ch[0] = (char)(ch[0] - 32) ;
        }
        System.out.println(ch);
    }
}
