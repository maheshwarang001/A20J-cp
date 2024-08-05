package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MakeMajority {


    static BufferedReader br;
    static PrintWriter pw;

    static StringTokenizer str;
    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve() throws Exception{

        int n  = Integer.parseInt(br.readLine().trim());
        String st = br.readLine().trim();

        char prev = '1';
        int c0 = 0;
        int c1 = 0;

        for(int i = 0 ; i < n ; i++){

            if(st.charAt(i) == '1'){
                c1++;
            }else if(st.charAt(i) == '0' && prev == '1'){
                c0++;
            }
            prev = st.charAt(i);
        }

        if(c0 >= c1) pw.println("NO");
        else pw.println("YES");


    }
}
