package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution1002 {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<String>();
        int n = A.length;
        String h = A[0];
        int[] mingrep = new int[26];
        for (int i = 0; i < h.length(); i ++) {
            int index = h.charAt(i) - 'a';
            mingrep[index] ++;
        }
        for (int i = 1; i < n; i ++) {
            String s = A[i];
            int[] tem = new int[26];
            for (int j = 0; j < s.length(); j ++) {
                int index = s.charAt(j) - 'a';
                tem[index] ++;
            }
            for (int k = 0; k < 26; k ++) {
                mingrep[k] = Math.min(mingrep[k], tem[k]);
            }
        }
        for (int i = 0; i < 26; i ++) {
            char c = (char) (i + 'a');
            for (int j = 0; j < mingrep[i]; j ++) {
                res.add(String.valueOf(c));
            }
        }
        return res;
    }
}
