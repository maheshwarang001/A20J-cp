package org.example.div2;


import java.util.*;

public class WorldIsMine {

    static int dp[][];

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            Integer[]nums = new Integer[n];
            Map<Integer, Integer> map = new TreeMap<>();
            List<Integer> freq = new ArrayList<>();

            for(int i = 0 ; i < n ; i++){
                Integer val = sc.nextInt();
                nums[i] = val;
                map.put(val, map.getOrDefault(val,0)+1);
            }

            for(Map.Entry<Integer,Integer>it: map.entrySet()){
                freq.add(it.getKey());
            }


            dp = new int[freq.size()+1][n+1];

            for(int[] it : dp){
                Arrays.fill(it,-1);
            }


            int ans = helper(0, freq, 0,map);
            System.out.println(freq.size()-ans);

        }

    }
    static int helper(int i, List<Integer> nums, int count, Map<Integer,Integer> map){
        if(i >= nums.size()) return 0;

        if(dp[i][count] != -1) return dp[i][count];
        //bob
        int total = count - map.get(nums.get(i));

        if(total >= 0){
            dp[i][count] = Math.max(1+helper(i+1,nums, total, map) , helper(i+1,nums,count + 1,map));
        }else{
            dp[i][count] = helper(i+1,nums,count + 1,map);
        }

        return dp[i][count] ;

    }

}
