package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MarkThePhotographer {


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

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());


        int[] height = new int[2*n];

        st = new StringTokenizer(br.readLine().trim());

        for(int i = 0 ; i < 2*n ; i++){
            height[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(height);


        int i = 0;
        int j = n;

        int flag = 0;

        while(j<2*n){

            if(Math.abs(height[j] - height[i])  >= x){
                i++;
                j++;
            }else{
                pw.println("NO");
                flag = 1;
                break;
            }
        }

        if(flag == 0) pw.println("YES");


    }
}
