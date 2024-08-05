package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OnlyPluses {

    static BufferedReader br;
    static PrintWriter pw;

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve() throws IOException {


        st = new StringTokenizer(br.readLine().trim());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        int[] arr = new int[]{a,b,c};




        for(int i = 0 ; i < 5 ; i++){

            Arrays.sort(arr);

            arr[0]++;

        }

        pw.println(arr[0]*arr[1]*arr[2]);



    }
}
