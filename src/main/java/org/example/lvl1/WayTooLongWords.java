package org.example.lvl1;

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i< n ; i++){

            String st = sc.next();

            if(st.length() > 10){
                int len = st.length()-2;

                System.out.println(st.charAt(0) + "" +  len + ""  + st.charAt(st.length()-1));
            }else{
                System.out.println(st);
            }
        }
    }
}
