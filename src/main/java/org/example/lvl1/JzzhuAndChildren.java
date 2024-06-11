package org.example.lvl1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JzzhuAndChildren {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Element> queue = new LinkedList<>();


        for(int i = 1 ; i <= n ; i++){
            queue.add(new Element(sc.nextInt(), i));
        }

        while(queue.size() > 1){

            Element el = queue.poll();

            if(el.val > m){
                queue.add(new Element(el.val-m,el.index));
            }

        }

        System.out.println(queue.poll().index);


    }

    static class Element{
        int val;
        int index;

        Element(int val, int index){
            this.val = val;
            this.index = index;
        }
    }
}

