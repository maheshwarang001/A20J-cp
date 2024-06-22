package org.example.striver;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int n = -1;
        int m = -1;

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){

                int input = sc.nextInt();

                if(input == 1){
                    n = i;
                    m = j;
                    int ans = Math.abs(n-2) + Math.abs(m-2);
                    System.out.println(ans);
                }
            }
        }



    }
}
