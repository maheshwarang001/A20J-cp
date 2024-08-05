package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CardBoard {

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
    public static void solve() throws Exception{

        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());

        long[] nums = new long[n];
        for(int i = 0 ; i < n ; i++) nums[i] = Long.parseLong(st.nextToken());


        int low= 1 ;
        int high = (int)1e9;
        long ans = 0;

        while(low <= high){

            int mid = low + (high-low)/2;
            long curr = 0L;
            for(long i : nums ){

               curr += (i  + 2L * mid) * (i + 2L * mid);
             if(curr > c) break;
            }

            if(curr == c){
                ans = mid;
                break;
            }else if( curr < c){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        pw.println(ans);

    }
}
