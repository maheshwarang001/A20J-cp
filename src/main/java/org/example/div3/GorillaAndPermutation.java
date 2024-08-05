package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GorillaAndPermutation {

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

        str = new StringTokenizer(br.readLine().trim());

        int n  = Integer.parseInt(str.nextToken());
        int m  = Integer.parseInt(str.nextToken());
        int k  = Integer.parseInt(str.nextToken());

        for(int i = n ; i > m ; i--){

            pw.print(i + " ");
        }

        for(int i = 1 ; i <= m ; i++){

            pw.print(i + " ");
        }
        pw.println();

    }
}
