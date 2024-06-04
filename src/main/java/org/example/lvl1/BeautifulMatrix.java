package org.example.lvl1;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);


        int[][] loc = new int[1][2];

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){

                int val = st.nextInt();

                if(val == 1){
                    loc[0][0] = i+1;
                    loc[0][1] = j+1;
                    break;
                }
            }
        }
        int result = Math.abs( loc[0][0] - 3) + Math.abs( loc[0][1] - 3);

        System.out.println(result);
        st.close();
    }
}
