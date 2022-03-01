package com.objects;

import com.objects.utils.ListNode;

import java.util.*;

public class Solution {

    //605. 种花问题
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int[][] dp = new int[2][flowerbed.length];
        dp[0][0] = 0;
        if(flowerbed[0] == 0 && (len == 1 || flowerbed[1] == 0)) {
            dp[1][0] = 1;
        }
        else {
            dp[1][0] = 0;
        }
        if(n <= dp[0][0] || n <= dp[1][0]) {
            return true;
        }
        for(int i = 1; i < len; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            if(flowerbed[i] != 1 && flowerbed[i - 1] != 1 &&
                    (i == len - 1 || flowerbed[i + 1] != 1)) {
                dp[1][i] = Math.max(dp[0][i - 1] + 1, dp[1][i - 1]);
            }
            else {
                dp[1][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            }
            if(n <= dp[0][i] || n <= dp[1][i]) {
                return true;
            }
        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        return false;
    }

    //435. 无重叠区间
    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if(len == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
//        System.out.println(Arrays.deepToString(intervals));
        int max_num = 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for(int i = 1; i < len; i++) {
            for(int j = 0; j < i; j++) {
                if(intervals[i][0] >= intervals[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max_num = Math.max(max_num, dp[i]);
        }
//        System.out.println(Arrays.deepToString(dp));
        return len - max_num;
    }

    //989. 数组形式的整数加法
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList();
        int index = A.length - 1;
        int pre = 0;
        while (K != 0 && index >= 0) {
            int sum = K % 10 + A[index] + pre;
            res.add(0, sum % 10);
            index--;
            K /= 10;
            pre = sum / 10;
        }
        if(K == 0) {
            while (index >= 0) {
                int sum = A[index] + pre;
                res.add(0, sum % 10);
                index--;
                pre = sum / 10;
            }
        }
        else {
            while (K != 0) {
                int sum = K % 10 + pre;
                res.add(0, sum % 10);
                K /= 10;
                pre = sum / 10;
            }
        }
        if(pre > 0) {
            res.add(0, pre);
        }
        System.out.println(res);
        return res;
    }

    //959. 由斜杠划分区域
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int res = 1;
        return res;
    }

    //131. 分割回文串
    List<String> partition_ans = new ArrayList<>();
    List<List<String>> partition_result = new ArrayList<>();
    boolean[][] partition_flag; // partition_flag[i][j]表示s[i...j]是否为回文串

    public void partitionDfs(String s, int i) {
        if(i == s.length()) {
            partition_result.add(new ArrayList<>(partition_ans));
            return;
        }
        for(int j = i; j < s.length(); j++) {
            if(partition_flag[i][j]) {
                partition_ans.add(s.substring(i, j + 1));
                partitionDfs(s, j + 1);
                partition_ans.remove(partition_ans.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        int n = s.length();
        partition_flag = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(partition_flag[i], true);
        }
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i + 1; j < n; j++) {
                partition_flag[i][j] = partition_flag[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
            }
        }
        partitionDfs(s, 0);
        return partition_result;
    }

    //132. 分割回文串
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        boolean[][] f = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(f[i], true);
        }
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i + 1; j < n; j++) {
                f[i][j] = f[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
            }
        }
        for(int i = 0; i < n; i++) {
            if(f[0][i]) {
                dp[i] = 0;
            }
            else {
                for(int j = 0; j < i; j++) {
                    if(f[j + 1][i]) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[n - 1];
    }

    // 面试题 16.26. 计算器
    public int calculate(String s) {
        String str = s.replaceAll(" ", "");
        int n = str.length();
        int result = 0;
        Stack<Integer> number = new Stack<>();
        Stack<Character> operator = new Stack<>();
        String temp_s = "";
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(valueOfChar(c) == 3) {
                temp_s = temp_s + c;
            }
            if(valueOfChar(c) < 3 || i == n - 1) {
                int num = Integer.parseInt(temp_s);
                temp_s = "";
                while ((!operator.empty()) && valueOfChar(c) <= valueOfChar(operator.peek())) {
                    num = calculator(number.pop(), num, operator.pop());
                }
                number.push(num);
                if(i < n - 1) {
                    operator.push(c);
                }
            }
        }
        while (!operator.empty()) {
            int b = number.pop();
            int a = number.pop();
            number.push(calculator(a, b, operator.pop()));
        }
        result = number.pop();
        return result;
    }

    public int calculator(int a, int b, char c) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    public int valueOfChar(char c) {
        if(c == '+' || c == '-') {
            return 1;
        }
        else if(c == '*' || c == '/') {
            return 2;
        }
        else if(c >= '0' && c <= '9') {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    // 224. 基本计算器
    public int calculateString(String s) {
        String str = s.replaceAll(" ", "");
        int n = str.length();
        Stack<Integer> number = new Stack<>();
        Stack<Character> operator = new Stack<>();
        String temp_str = "";
        for(int i = 0; i < n; i++) {
            char curr_char = str.charAt(i);
            if(valueOfChar(curr_char) == 3) {
                temp_str = temp_str + curr_char;
            }
            if(curr_char == '(') {
                operator.push(curr_char);
            }
            else if(curr_char == ')') {
                if(temp_str != "") {
                    int curr_num = Integer.parseInt(temp_str);
                    temp_str = "";
                    number.push(curr_num);
                }
                while (operator.peek() != '(') {
                    int b = number.pop();
                    int a = number.pop();
                    number.push(calculator(a, b, operator.pop()));
                }
                operator.pop();
            }
            else if(valueOfChar(curr_char) < 3 || i == n - 1) {
                if(temp_str != "") {
                    int curr_num = Integer.parseInt(temp_str);
                    temp_str = "";
                    number.push(curr_num);
                }
                else {
                    if(curr_char == '-' && (number.empty() || (!operator.empty() && operator.peek() == '('))) {
                        number.push(0);
                    }
                }
                while ((!operator.empty()) && operator.peek() != '(' && valueOfChar(curr_char) <= valueOfChar(operator.peek())) {
                    int b = number.pop();
                    int a = number.pop();
                    number.push(calculator(a, b, operator.pop()));
                }
                if(i < n - 1) {
                    operator.push(curr_char);
                }
            }
            System.out.println("======================" + i + "========================");
            System.out.println(curr_char);
            System.out.println(number);
            System.out.println(operator);
        }
        while (!operator.empty()) {
            int b = number.pop();
            int a = number.pop();
            number.push(calculator(a, b, operator.pop()));
        }
        return number.pop();
    }

    // 331. 验证二叉树的前序序列化
    public boolean isValidSerialization(String preorder) {
        String[] strArr = preorder.split(",");
//        System.out.println(Arrays.toString(strArr));
        int n = strArr.length;
        Stack<String> node = new Stack<>();
        for(String s : strArr) {
            if(s.equals("#")) {
                while (!node.empty() && node.peek().equals("#")) {
                    node.pop();
                    if(node.empty()) {
                        return false;
                    }
                    node.pop();
                }
            }
            node.push(s);
//            System.out.println("node======" + node);
        }
        String t = node.pop();
//        System.out.println(t);
        return t.equals("#") && node.empty();
    }

    public boolean isValidSerialization2(String preorder) {
        int n = preorder.length();
        int slots = 1;
        int i = 0;
        while (i < n) {
            if(slots == 0) {
                return false;
            }
            if(preorder.charAt(i) == '#') {
                i++;
                slots--;
            }
            else if(preorder.charAt(i) == ',') {
                i++;
            }
            else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                slots++;
            }
        }
        return slots == 0;
    }

    // 54. 螺旋矩阵
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < (m + 1) / 2; i++) {
            System.out.println("# " + i + " ==================");
            for(int j = i; j < n - i; j++) {
                if(result.size() == m * n) {
                    return result;
                }
                System.out.println("第一 = " + matrix[i][j]);
                result.add(matrix[i][j]);
            }
            for(int j = i + 1; j < m - i - 1; j++) {
                if(result.size() == m * n) {
                    return result;
                }
                System.out.println("第二 = " + matrix[j][n - i - 1]);
                result.add(matrix[j][n - i - 1]);
            }
            for(int j = n - 1 - i; j > i; j--) {
                if(result.size() == m * n) {
                    return result;
                }
                System.out.println("第三 = " + matrix[m - 1 - i][j]);
                result.add(matrix[m - 1 - i][j]);
            }
            for(int j = m - 1 - i; j > i; j--) {
                if(result.size() == m * n) {
                    return result;
                }
                System.out.println("第四 = " + matrix[j][i]);
                result.add(matrix[j][i]);
            }
        }
        return result;
    }

    // 115.不同的子序列
    int numDistinct_result = 0;

    public int numDistinct(String s, String t) {
        if(t.length() == 0) {
            return 1;
        }
        if(s.length() < t.length()) {
            return 0;
        }
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                }
                else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

    // 超时了
    public void numDistinct_dfs(int s_index, int t_index, String s, String t) {
        if(t_index == t.length()) {
            numDistinct_result++;
            return;
        }
        for(int s_i = s_index; s_i < s.length(); s_i++) {
            while ((s.length() - s_i >= t.length() - t_index) && s.charAt(s_i) != t.charAt(t_index)) {
                s_i++;
            }
            if(s.length() - s_i < t.length() - t_index) {
                return;
            }
            if(s.charAt(s_i) == t.charAt(t_index)) {
                numDistinct_dfs(s_i + 1, t_index + 1, s, t);
            }
        }
    }

    // 73.矩阵置零
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean raw0Flag = false, col0Flag = false;
        for(int[] ints : matrix) {
            if(ints[0] == 0) {
                col0Flag = true;
                break;
            }
        }
        for(int j = 0; j < n; j++) {
            if(matrix[0][j] == 0) {
                raw0Flag = true;
                break;
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(col0Flag) {
            for(int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if(raw0Flag) {
            for(int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    //
    public int hammingWeight(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++) {
            if((n & (1 << i)) != 0) {
                res++;
            }
        }
        return res;
    }

    // 264.第n个丑数
    public int nthUglyNumber(int n) {
        int[] result = new int[n];
        result[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for(int i = 1; i < n; i++) {
            result[i] = getMin(result, p2, p3, p5);
            if(result[i] == result[p2] * 2) {
                p2++;
            }
            if(result[i] == result[p3] * 3) {
                p3++;
            }
            if(result[i] == result[p5] * 5) {
                p5++;
            }
        }
        System.out.println(Arrays.toString(result));
        return result[n - 1];
    }

    int getMin(int[] result, int a, int b, int c) {
        int min = Math.min(result[a] * 2, result[b] * 3);
        min = Math.min(min, result[c] * 5);
        return min;
    }

    // 179. 最大数
    public String largestNumber(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(sum == 0) {
                sum += nums[i];
            }
            list.add(String.valueOf(nums[i]));
        }
        if(sum == 0) {
            return "0";
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s = o2 + o1;
                return s.compareTo(o1 + o2);
            }
        });
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; i++) {
            res.append(list.get(i));
        }
        return res.toString();
    }

    // 523. 连续的子数组和
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            int reminder = sum % k;
            System.out.println("sum====" + sum);
            System.out.println("reminder====" + reminder);

            if(!map.containsKey(reminder)) {
                map.put(reminder, i);
                System.out.println(map.get(reminder));
            }
            else {
//                System.out.println(map.get(reminder));
                if(i - map.get(reminder) > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // 160. 相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA), lenB = getLen(headB);
        ListNode tempA = lenA > lenB ? headA : headB;
        ListNode tempB = lenA <= lenB ? headA : headB;
        int l = lenA > lenB ? lenA - lenB : lenB - lenA;
        int step = 0;
        while (tempA != null && tempB != null) {
            if(tempA == tempB && tempA != null) {
                return tempA;
            }
            if(step >= l) {
                tempB = tempB.next;
            }
            step++;
            tempA = tempA.next;
        }
        return null;
    }

    int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // 525. 连续数组
    public int findMaxLength(int[] nums) {
        int max = 0;
        int diff = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                diff--;
            }
            else {
                diff++;
            }
            if(map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }
            else {
                map.put(diff, i);
            }
        }
        return max;
    }

    // 494. 目标和
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, 0, 0, target);
    }

    int findTargetSumWays(int[] nums, int i, int sum, int target) {
        if(i >= nums.length) {
            if(sum == target) {
                return 1;
            }
            else {
                return 0;
            }
        }
        int a = findTargetSumWays(nums, i + 1, sum + nums[i], target);
        int b = findTargetSumWays(nums, i + 1, sum - nums[i], target);
        return a + b;
    }

    // 496. 下一个更大元素I
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for(int i = 0; i < nums1.length; i++) {
            boolean isFound = false;
            for(int k : nums2) {
                if(nums1[i] == k) {
                    isFound = true;
                }
                if(isFound && nums1[i] < k) {
                    res[i] = k;
                    break;
                }
            }
        }
        return res;
    }

    // 299. 猜数字游戏
    public String getHint(String secret, String guess) {
        int x = 0;
        int y = 0;
        int[][] record = new int[2][10];
        int n = secret.length();
        for(int i = 0; i < n; i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if(c1 == c2) {
                x++;
            }
            else {
                record[0][c1 - '0']++;
                record[1][c2 - '0']++;
            }
        }
        for(int i = 0; i < 10; i++) {
            y += Math.min(record[0][i], record[1][i]);
        }
        return x + "A" + y + "B";
    }

    // 6. Z字形变换
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        int len = s.length();
        int step = numRows * 2 - 2;
        for(int i = 0; i < numRows; i++) {
            int index_1 = i;
            int index_2 = step - i;
            while (index_1 < len || index_2 < len) {
                if(i == 0 || i == numRows - 1) {
                    res.append(s.charAt(index_1));
                }
                else {
                    if(index_1 < len) {
                        res.append(s.charAt(index_1));
                    }
                    if(index_2 < len) {
                        res.append(s.charAt(index_2));
                    }
                }
                index_1 += step;
                index_2 += step;
            }
        }
        return res.toString();
    }
}