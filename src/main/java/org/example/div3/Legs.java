package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Legs {

    static BufferedReader br;
    static PrintWriter pw;
    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve()throws Exception{

        int x = Integer.parseInt(br.readLine().trim());
        //first count all 4 legs
        int cows = x/4;
        x = x%4;
        int hen = x/2;


        pw.println(cows + hen);
    }
}
