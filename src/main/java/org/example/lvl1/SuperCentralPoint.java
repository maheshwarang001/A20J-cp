package org.example.lvl1;

import java.util.Scanner;

public class SuperCentralPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] x = new int[n+1];
        int [] y = new int[n+1];

        for(int i = 1 ; i<=n ; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 1 ; i<= n ; i++){

            boolean u  = false;
            boolean lw = false;
            boolean r = false ;
            boolean l = false;

            for(int j = 1 ; j <= n ; j++){

                if(x[j] > x[i] && y[j] == y[i]) r = true;

                if( x[j] < x[i] && y[j] == y[i]) l = true;

                if(x[j] == x[i] && y[j] < y[i]) lw = true;

                if(x[j] == x[i] && y[j] > y[i]) u = true;
            }

            if(u && lw  && r && l) count++;
        }
        System.out.println(count);
    }



}
