package org.example.div3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Xor {

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

        int n =Integer.parseInt(br.readLine().trim());

        str = new StringTokenizer(br.readLine().trim());

        String st = str.nextToken();
        str = new StringTokenizer(br.readLine().trim());
        String st2 = str.nextToken();
        int flag = 0;

        for(int i = 0 ; i < n ; i++){

            if(st.charAt(i) =='0' && st2.charAt(i) =='0' )continue;

            if(st.charAt(i) == '0' && st2.charAt(i) == '1'  ){
                flag = 1;
                pw.println("NO");
                break;
            }
            else break;

        }
        if(flag== 0) pw.println("YES");




    }




}
