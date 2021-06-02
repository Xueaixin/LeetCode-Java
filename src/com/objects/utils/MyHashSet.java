package com.objects.utils;

import java.util.LinkedList;

public class MyHashSet {
    private static final int prime = 2617;
    private LinkedList[] set;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        set = new LinkedList[prime];
        for(int i = 0; i < prime; i++) {
            set[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int index = hash(key);
        for(int i = 0; i < set[index].size(); i++) {
            Object value = set[index].get(i);
            if((Integer) value == key) {
                return;
            }
        }
        set[index].add(key);
    }

    public void remove(int key) {
        int index = hash(key);
        for(int i = 0; i < set[index].size(); i++) {
            Object value = set[index].get(i);
            if((Integer) value == key) {
                set[index].remove(value);
                return;
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int index = hash(key);
        for(int i = 0; i < set[index].size(); i++) {
            Object value = set[index].get(i);
            if((Integer) value == key) {
                return true;
            }
        }
        return false;
    }

    int hash(int key) {
        return key % prime;
    }
}
