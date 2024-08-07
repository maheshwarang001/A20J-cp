package org.example.div3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ExpectedMedian {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) solve();

        br.close();
        pw.close();
    }

    public static void solve() throws Exception {
        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long sumOfMedians = 0;
        List<Integer> current = new ArrayList<>();

        sumOfMedians = generateSubsequences(nums, n, k, 0, current, sumOfMedians);

        pw.println(sumOfMedians);
    }

    static long generateSubsequences(int[] nums, int n, int k, int index, List<Integer> current, long sumOfMedians) {

        if (index >= n) return sumOfMedians;

        if (current.size() == k) {
            int medianIndex = ((k - 1) / 2) -1;
            sumOfMedians += current.get(medianIndex) % (int) 1e9+7;
            return sumOfMedians;
        } else {

            sumOfMedians = generateSubsequences(nums, n, k, index + 1, current, sumOfMedians);

            current.add(nums[index]);
            sumOfMedians = generateSubsequences(nums, n, k, index + 1, current, sumOfMedians);
            current.remove(current.size() - 1);

            return sumOfMedians;
        }
    }
}
