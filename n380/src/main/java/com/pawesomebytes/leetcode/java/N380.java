package com.pawesomebytes.leetcode.java;

import java.util.*;

public class N380 {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public N380() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        if (list.get(list.size() - 1) != val) {
            int index = map.get(val);
            int last = list.get(list.size() - 1);
            list.set(index, last);
            map.replace(last, index);
        }

        map.remove(val);
        list.remove(list.size() - 1);

        return true;
    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
