package org.example.div2;

import java.lang.reflect.Array;
import java.util.*;

public class QAQAndMochaArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            List<Long> nums = new ArrayList<>();
            int flag = 0;

            Set<Long> set =  new HashSet<>();

            for(int i = 0 ; i < n ; i++){

                long val = sc.nextLong();
                if(!set.contains(val)){
                    nums.add(val);
                    set.add(val);
                }


                if(val == 1) flag= 1;
            }

            if(flag == 1){
                System.out.println("YES");

            }else {

                Collections.sort(nums);

                long x = nums.get(0);
                int b = 0;


                for (int i = 1; i < nums.size(); i++) {

                    if (nums.get(i) % x != 0) {
                        b = i;
                        break;
                    }
                }
                if(b == n-1) {
                    System.out.println("YES");
                }else {
                    for (int i = b + 1; i < nums.size(); i++) {

                        if (nums.get(i) % x != 0 && nums.get(i) % nums.get(b) != 0) {
                            System.out.println("NO");
                            flag = 1;
                            break;
                        }
                    }

                    if (flag == 0) System.out.println("YES");
                }
            }

        }

    }
}
