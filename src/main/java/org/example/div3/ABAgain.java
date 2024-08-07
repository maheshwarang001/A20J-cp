package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ABAgain {
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
    public static void solve() throws Exception{

        int n = Integer.parseInt(br.readLine().trim());

        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n/10;
        }

        pw.println(sum);



    }
}
