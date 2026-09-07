package com.company;

import java.util.List;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        for (int i = 0; i < n; i ++) {
//            String str = s.substring(0, i + 1);
//            if (wordDict.contains(str)) {
//                dp[i] = true;
//                continue;
//            }
            for (int j = -1; j < i; j ++) {
                String str = s.substring(j + 1, i + 1);
                if ((j == -1 || dp[j]) && wordDict.contains(str)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
    }
}
