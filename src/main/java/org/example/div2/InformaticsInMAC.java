package org.example.div2;

import java.util.*;

public class InformaticsInMAC {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();
        int [] nums = new int[n];



        Map<Integer,Integer> mex_map = new HashMap<>();
        for(int i = 0 ; i  < n ; i++){
            nums[i] = sc.nextInt();

            mex_map.put(nums[i],1);
        }

        int mex = 0;

        for(int i = 0 ; i  < 1e5+5 ; i++){

            if(!mex_map.containsKey(i)){
                mex = i;
               // System.out.println(mex);
                break;
            }


        }


        //System.out.println(mex);

        if(mex == 0){

            System.out.println(2);
            System.out.println(1 + " " + 1);
            System.out.println(2 + " "+ n);
        }else{

            int left = -1;

            Map<Integer,Integer> map = new HashMap<>();

            List<int[]> list = new ArrayList<>();


            for(int i = 0 ; i < n ; i++){

                if(nums[i] < mex){
                    map.put(nums[i],1);
                }
                if(left == -1){
                    left = i;
                }
                if(map.size() == mex){
                    int a = i+1;
                    list.add(new int[] {left+1 , a});
                    left = -1;
                    map.clear();

                }

            }

            list.get(list.size()-1)[1] = n;


            if(list.size() < 2){
                System.out.println(-1);
            }else{
                System.out.println(list.size());
                for(int[] st : list){
                    System.out.println(st[0] + " " + st[1]);
                }
            }



        }







    }
}
