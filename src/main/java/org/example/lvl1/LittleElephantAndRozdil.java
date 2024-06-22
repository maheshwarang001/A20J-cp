package org.example.lvl1;

import java.util.Scanner;

public class LittleElephantAndRozdil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long min = Long.MAX_VALUE;
        String idx = "";

        for(int i = 0 ; i < n ; i++){
            long val = sc.nextLong();

            if(min > val){
                min = val;
                idx = i+1 + "";
            }
            else if(min == val ){
                idx = "Still Rozdil";

            }
        }
        System.out.println(idx);
    }
}
