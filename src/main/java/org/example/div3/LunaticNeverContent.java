package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LunaticNeverContent {

    static long binaryExpRecur(long base, long exponential) {
        final long MOD = 1000000000;

        if (exponential == 0) {
            return 1;
        }

        long half = binaryExpRecur(base, exponential / 2);
        long halfsquare = (half * half) % MOD;

        if (exponential % 2 != 0) {
            return (halfsquare * base) % MOD;
        } else {
            return halfsquare;
        }
    }

    static long binaryExpItr(long base , long exponential){
        long ans = 1;
        final int MOD = (int) 1e9;

        while(exponential != 0){
            if((exponential & 1) != 0){
                ans = (ans * base) % MOD;
            }
            base  = (base * base) % MOD;
            exponential >>= 1;
        }
        return (ans)  % MOD;
    }

    public static long lcm(long a, long b){
        return Math.abs((a*b))/gcd(a,b);
    }
    public static long gcd(long a , long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void swapDigit(int a, int b, int[] nums){
        nums[a] = nums[a]^nums[b];
        nums[b] = nums[a]^nums[b];
        nums[a] = nums[a]^nums[b];
    }





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

        int n = Integer.parseInt(br.readLine().trim());

        st = new StringTokenizer(br.readLine().trim());

        long[] nums = new long[n];
        for(int i = 0 ; i  < n ; i++) nums[i] = Long.parseLong(st.nextToken());


        List<Long> list = new ArrayList<>();

        int i = 0;
        int j = nums.length-1;

        while(i <= j ){

            list.add(Math.abs(nums[i]-nums[j]));
            i++;
            j--;
        }

        long gcd = 0;

        for(i = 0 ; i  < list.size() ; i++){
            gcd = gcd(gcd,list.get(i));
        }
        pw.println(gcd);

    }
}
