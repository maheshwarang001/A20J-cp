package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BuildingAnAquarium {
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

        st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());

        long[] nums = new long[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = Long.parseLong(st.nextToken());

        }

        long left = 0;
        long right = 2*(long)1e9+7;

        while(left < right){

            long mid = left + (right-left+1)/2;
            long ans = helper(mid,nums);
            if( ans > target){
                right = mid-1;
            }else{
                left = mid;
            }
        }
        pw.println(left);

    }

    static long helper(long height , long [] nums){
        long count = 0;

        for (long num : nums) {

            count += Math.max(height-num,0L);

        }

        return count;
    }
}
