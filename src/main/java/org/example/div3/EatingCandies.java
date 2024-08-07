package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EatingCandies {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) solve();

        br.close();
        pw.close();

    }
    public static void solve()throws Exception{

        int n  = Integer.parseInt(br.readLine().trim());

        int[] nums =  new int[n];

        st = new StringTokenizer(br.readLine().trim());

        for(int i = 0 ; i  < n ; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = n-1;
        int l = 0;
        int r = 0;

        int ans = 0;

        while(i<=j){

            if(l < r){
                l += nums[i++];
            }else{
                r += nums[j--];
            }

            if(l == r) {
                ans = (i) + (n - (j + 1));
            }
        }
        pw.println(ans);


    }
}
