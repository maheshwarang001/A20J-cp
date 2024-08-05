package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MarkTheDustSweeper {


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

        int n = Integer.parseInt(br.readLine().trim());

        int[] nums = new int[n];

        str = new StringTokenizer(br.readLine().trim());

        for(int i = 0 ; i < n ; i++){
            nums[i] = Integer.parseInt(str.nextToken());
        }

        int idx = 0;
        long steps = 0;

        while(idx<n && nums[idx] == 0) idx++;

        for(int i = idx ; i < n-1 ;i++){

            if(nums[i] == 0) steps += 1;
            else steps += nums[i];
        }
        System.out.println(steps);


    }
}
