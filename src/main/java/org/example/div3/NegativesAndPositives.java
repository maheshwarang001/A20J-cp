package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NegativesAndPositives {


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

        for(int i = 0 ; i < n; i++){
            nums[i] = Integer.parseInt(str.nextToken());
        }

        long sum = 0;
        int even = 0;
        int min = (int)1e9+1;
        for(int i = 0 ; i < n ; i++) {

            if(nums[i] < 0) {
                even++;
                nums[i] = Math.abs(nums[i]);
            }
            //pw.println(nums[i]);
            min = Math.min(Math.abs(nums[i]),min);
            sum += nums[i];
        }

        if((even % 2) == 1){


            sum -= (2L * min);
        }
        pw.println(sum);


    }
}
