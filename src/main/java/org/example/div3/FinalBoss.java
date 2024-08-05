package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class FinalBoss {

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
    public static void solve() throws Exception {
        st = new StringTokenizer(br.readLine().trim());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] attack = new long[n];
        long[] times = new long[n];

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            attack[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            times[i] = Long.parseLong(st.nextToken());
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            pq.add(new long[]{1, i});
        }

        long lastTurn = 1;

        while (h > 0) {
            long[] pair = pq.poll();
            lastTurn = pair[0];
            h -= attack[(int)pair[1]];
            pq.offer(new long[]{(pair[0] + times[(int) pair[1]]), (int) pair[1]});
        }

        pw.println(lastTurn);
    }
}