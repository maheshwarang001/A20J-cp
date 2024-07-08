package org.example.div2;


import java.util.*;

public class EqualXOR {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] nums_1 = new int[n];
        int [] nums_2 = new int[n];

        Map<Integer,Integer> map_1 = new HashMap<>();
        Map<Integer,Integer> map_2 = new HashMap<>();



        for(int i = 0 ; i  < n ; i++){
            nums_1[i] = sc.nextInt();
            map_1.put(nums_1[i],map_1.getOrDefault(nums_1[i],0)+1);
        }

        //int idx = 0;

        for(int i = 0 ; i < n ; i++){
            nums_2[i] = sc.nextInt();
            map_2.put(nums_2[i],map_2.getOrDefault(nums_2[i],0)+1);
        }

        //System.out.println(Arrays.toString(nums_2));


        // take all the ones

        int [] ans_1 = new int[2*k];
        int [] ans_2 = new int[2*k];


        int x = 0;
        int y = 0;
        int flag = 0;




            //iterate only 2s

            for(int i : nums_1) {

                if(x == 2 * k) break;

                if(map_1.get(i) > 1){
                    ans_1[x++] = i;
                    if(x < 2 * k){
                        ans_1[x++] = i;
                    }
                }

            }

            for(int i : nums_2) {

                if(y == 2 * k) break;

                if(map_2.get(i) > 1){
                    ans_2[y++] = i;
                    if(y < 2 * k){
                        ans_2[y++] = i;
                    }
                }
            }

        for(Map.Entry<Integer,Integer> it : map_1.entrySet()){

            if(x == 2 * k && y == 2 * k) {
                break;
            }

            if(it.getValue() == 1 && map_2.containsKey(it.getKey())){
                ans_1[x++] = it.getKey();
                ans_2[y++] = it.getKey();

            }

        }



//        System.out.println(x);
//        System.out.println(y);

        int xor = 0;
        int xor1 = 0;

        for(int i : ans_1){
            xor ^= i;
            System.out.print(i +" ");
        }

        System.out.println();
        for(int i : ans_2){
            xor1 ^= i;
            System.out.print(i +" ");
        }

        System.out.println();

        //System.out.println(xor + " " + xor1);




    }
}
