package org.example.bit;

import java.util.Scanner;

public class AncientCivilization {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t=  sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int x = sc.nextInt();

            int [] arr=  new int[n];

            int ans = 0;

            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0 ; i < x ; i++){
                int count_0 = 0;
                int count_1 = 0;

                for(int j = 0 ; j < n ; j++){
                    if((arr[j] & (1<<i)) != 0){
                        count_1++;
                    }else{
                        count_0++;
                    }

                }

                if(count_1 > count_0){
                    ans = (ans | (1  << i ));
                }else{
                    ans = (ans & (~(1<< i)));
                }
            }
            System.out.println(ans);

        }
    }
}
