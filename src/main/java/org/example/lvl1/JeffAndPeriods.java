package org.example.lvl1;

import java.util.*;

public class JeffAndPeriods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long i, k , n, x;

        Map<Long, List<Long>> mp = new HashMap<>();

        n = sc.nextLong();
        for (i = 0; i < n; i++) {
            x = sc.nextLong();
            mp.putIfAbsent(x, new ArrayList<>());
            mp.get(x).add(i);
        }

        List<Pair> v = new ArrayList<>();
        for (Map.Entry<Long, List<Long>> entry : mp.entrySet()) {
            k = entry.getKey();
            List<Long> indices = entry.getValue();

            if (indices.size() == 1) {
                v.add(new Pair(k, 0));
            } else {
                Set<Long> s = new HashSet<>();
                for (i = 1; i < indices.size(); i++) {
                    s.add(Math.abs(indices.get((int) i) - indices.get((int) i - 1)));
                }

                if (s.size() == 1) {
                    v.add(new Pair(k, s.iterator().next()));
                }
            }
        }
        v.sort(Comparator.comparingLong(a -> a.first));

        System.out.println(v.size());
        for (Pair pair : v) {
            System.out.println(pair.first + " " + pair.second);
        }

        sc.close();
    }
}

class Pair {
    long first, second;

    Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
