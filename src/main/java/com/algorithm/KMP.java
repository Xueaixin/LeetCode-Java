package com.algorithm;

public class KMP {

    int[] getNext(String t) {
        int len = t.length();
        int[] next = new int[len + 1];
        next[1] = 0;
        int i = 1, maxLen = 0;
        while (i < len) {
            if(maxLen == 0 || t.charAt(i - 1) == t.charAt(maxLen - 1)) {
                maxLen++;
                i++;
                next[i] = maxLen;
            }
            else {
                maxLen = next[maxLen];
            }
        }
        return next;
    }

    int match(String s, String t, int[] next) {
        String temp = "_" + t;
        int i = 0, j = 1;
        while (i + temp.length() - j <= s.length() && j < temp.length()) {
            if(s.charAt(i) == temp.charAt(j)) {
                i++;
                j++;
            }
            else {
                j = next[j];
            }
        }
        return j > t.length() ? i - t.length() : -1;
    }
}
