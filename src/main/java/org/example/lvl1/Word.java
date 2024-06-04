package org.example.lvl1;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String query = sc.next();

        int lowercase = 0;
        int uppercase = 0;

        for(char ch : query.toCharArray()){

            if(ch >= 'A' && ch <= 'Z'){
                uppercase++;

            }else{
                lowercase++;
            }

        }

        if(uppercase > lowercase){
            System.out.println(query.toUpperCase());
        }else{
            System.out.println(query.toLowerCase());
        }
    }
}
