package org.example.lvl1;

import java.util.Scanner;

public class Borze {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String str = st.next();

        int n = str.length();

        char [] ch = str.toCharArray();

        String ans = "";

        for(int i = 0 ; i < n ; i++ ){

            if(ch[i] == '.'){
                ans += "0";
            }
            else{

                if( i < n-1 && ch[i+1] == '.'){
                    ans+="1";
                    i++;
                }
                else  if( i < n-1 && ch[i+1] == '-'){
                    ans+="2";
                    i++;
                }
            }
        }

        System.out.println(ans);
        st.close();
    }
}
