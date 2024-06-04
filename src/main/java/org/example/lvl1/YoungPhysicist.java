package org.example.lvl1;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [][] mt = new int[t][3];

        int []sum = new int[t];

        for(int i = 0 ; i < t ; i++){
            for(int j = 0 ; j < 3 ; j++) {
                mt[i][j] = sc.nextInt();
                sum[j] += mt[i][j];
            }
        }

        String ans = "YES";

        if(sum[0] == 0 && sum[1] ==0 && sum[2] ==0 ){
            System.out.println(ans);
        }else{
            ans = "NO";
            System.out.println(ans);
        }



        sc.close();





    }


}
