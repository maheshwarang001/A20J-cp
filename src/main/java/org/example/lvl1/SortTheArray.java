package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

class SortTheArray{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] nums = new int[n];
        int [] temp = new int[n];

        for(int i = 0 ; i < n ; i++){
            int val =  sc.nextInt();

            nums[i] = val;
            temp[i] = val;
        }


        Arrays.sort(temp);

        int first = -1;
        int second = -1;

        for(int i = 0 ; i < n ; i++){

            if(nums[i]  != temp[i]){

                if(first == -1){
                    first = i;
                }
                second = i+1;
            }
        }

        reverse(first,second-1,nums);

        for(int i = 0 ; i< n ; i++){

            if(temp[i] != nums[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");

        if( first == -1 && second == -1){
            System.out.println(1 + " " + 1);

        }else {
            System.out.println(first + 1 + " " + second);
        }
    }


    static  void reverse(int i , int j , int[] arr){

        while(i <= j){
            swap(i,j,arr);
            i++;
            j--;
        }

    }

    static void swap(int i , int j, int [] arr){

        if(i != j){
             arr[i] = arr[i] ^ arr[j];
             arr[j] = arr[i] ^ arr[j];
             arr[i] = arr[i] ^ arr[j];
        }
    }

}