package org.example.div2;

import java.util.*;
import java.util.Scanner;

public class FormingTriangles {


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        Map<Long,Long> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){

            long v = sc.nextLong();
            map.put(v, map.getOrDefault(v,0L)+1);
        }
        long ans = 0L;
        long sum = 0L;
        for(Map.Entry<Long,Long> m : map.entrySet()){

            long k = m.getValue();
            if(k >= 3){
                ans+= (k * (k-1) *(k-2))/6;
            }
            if(k >= 2){
                ans += k * (k-1)/2 * sum;
            }
            sum +=  k;
        }
        System.out.println(ans);

    }
}
