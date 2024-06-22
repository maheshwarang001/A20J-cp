package org.example.bit;

import java.util.Scanner;

public class NotQuiteLatinSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int ans = 0;
            for(int i = 0 ; i < 3 ; i++){

                String str = sc.next();
                int u = 0;
                for(char ch : str.toCharArray() ){
                    //make the ith bit set
                    if(ch == 'A'){
                        u = (u | (1<<0));
                    }
                    else if(ch == 'B'){
                        u = (u | (1<<1));
                    }else if(ch == 'C'){
                        u = (u | (1<<2));
                    }
                }
                if(i > 0){
                    ans = ans & u;
                }else{
                    ans = u;
                }
            }
            for(int i = 0 ; i < 3 ; i++){

                if( (ans & (1<<i)) == 0){
                    if(i == 0){
                        System.out.println("A");
                    }else if(i == 1){
                        System.out.println("B");
                    }else {
                        System.out.println("C");
                    }

                }
            }
        }
    }
}
