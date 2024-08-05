package org.example.div3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class MaximumSum {


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
    public static void solve()throws Exception {

        st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        long [] nums = new long[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums);

        long [] prefix = new long[n+1];
        for(int i = 1 ; i <= n ; i++ ){
            prefix [i] = prefix[i-1] + nums[i-1];
        }

        long res = 0;
        for(int i = 0 ; i <= k ; i++){

            res = Math.max(res, prefix[n-(k-i)] - prefix[i*2]);

        }

        pw.println(res);


    }
}