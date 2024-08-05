package org.example.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InterestingDrink {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        br = new BufferedReader( new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);

        //int t = Integer.parseInt(br.readLine().trim());
        //while(t-- > 0)
        solve();

        br.close();
        pw.close();

    }
    public static void solve() throws Exception{
        int n = Integer.parseInt(br.readLine().trim());
        int[] nums=  new int[n];

        st = new StringTokenizer(br.readLine().trim());
        for(int i = 0 ; i < n ;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int q = Integer.parseInt(br.readLine().trim());

        Arrays.sort(nums);

        while(q-- > 0){

            int target = Integer.parseInt(br.readLine().trim());

            int low = -1;
            int high = n;


            while(high-low>1){

                int mid = low + (high - low)/2;

                if(nums[mid]> target){
                    high = mid;
                }
                else{
                   low = mid;
                }

            }

            pw.println(low+1);


        }
    }
}
