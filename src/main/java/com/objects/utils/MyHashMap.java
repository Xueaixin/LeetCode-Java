package com.objects.utils;

import java.util.LinkedList;

class MyHashMap {

    private LinkedList<int[]>[] map;
    private int prime = 2617;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        map = new LinkedList[prime];
        for(int i = 0; i < prime; i++) {
            map[i] = new LinkedList<>();
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = key % prime;
        int[] k_v = {key, value};
        for(int i = 0; i < map[index].size(); i++) {
            int[] obj = map[index].get(i);
            if(obj[0] == key) {
                map[index].set(i, k_v);
                return;
            }
        }
        map[index].add(k_v);
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = key % prime;
        for(int i = 0; i < map[index].size(); i++) {
            int[] obj = map[index].get(i);
            if(obj[0] == key) {
                return obj[1];
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int index = key % prime;
        for(int i = 0; i < map[index].size(); i++) {
            int[] obj = map[index].get(i);
            if(obj[0] == key) {
                map[index].remove(obj);
            }
        }
    }
}