package org.example.div2;

import java.util.*;

public class SofiaAndTheLostOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            long[] nums = new long[n];
            long[] di= new long[n];

            for(int i = 0 ; i < n ; i ++){
                nums[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n ; i ++){
                di[i] = sc.nextInt();
            }

            Map<Long,Integer> map = new HashMap<>();
            Set<Long> set =  new HashSet<>();

            for(int i = 0 ; i < n ; i++){

                set.add(di[i]);

                if(nums[i] == di[i])continue;

                map.put(di[i] , map.getOrDefault(di[i] , 0) +1);

            }

            int m = sc.nextInt();
            long [] arr = new long[m];

            for(int i = 0 ; i < m ; i++){
                arr[i] = sc.nextLong();
            }

            String flag = "";
            for(long i : arr ){

                if(set.contains(i)) {
                    flag = "YES";

                    if(map.containsKey(i)) {

                        map.put(i, map.get(i) - 1);

                        if (map.get(i) == 0) map.remove(i);
                    }
                }else{
                    flag = "NO";
                }

            }

            String ans  = ( flag.equals("YES") && map.isEmpty()) ? "YES" : "NO";
            System.out.println(ans);

        }
    }
}