package com.tests;

import java.util.HashMap;
import java.util.Map;

public class Example {

    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap();
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        else {
            int totalCount = climbStairs(n - 1) + climbStairs(n - 2);
            System.out.println(totalCount);
            map.put(n, totalCount);
            return totalCount;
        }
    }

    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String args[]) {
        Example ex = new Example();
//        ex.change(ex.str, ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
        System.out.println(ex.climbStairs(5));
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }
}
