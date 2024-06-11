package org.example.lvl1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer,Integer> map= new HashMap<>();

        int count = 0;

        for(int i = 0 ; i < 4 ; i++){

            int val = sc.nextInt();
            if(map.containsKey(val)) {
                count++;
            }
            else{
               map.put(val,1);
            }
        }
        System.out.println(count);

    }
}
