package com.tests;

import com.objects.Solution;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Example {

    private static final String MAX_NO = "7FFFFFFF";

    private static Boolean getOverFlow(String cardSN) {
        return cardSN.compareTo(MAX_NO) > 0;
    }

    @Test
    public void test01() {

        String cardSN = "80000000";

        String cardNo = "";

        Boolean overFlow = getOverFlow(cardSN);
        if (true) {
            cardNo = String.valueOf(Long.valueOf(Long.parseLong(cardSN, 16)).intValue());
        } else {
            cardNo = String.valueOf(Integer.parseInt(cardSN, 16));
        }
        System.out.println(cardNo);

        System.out.println(Integer.MAX_VALUE);

        String a = "-2147483648";

//        System.out.println(Long.parseLong(a, 10));
        Integer b = Integer.parseInt(a, 10);
        System.out.println(b);
        // 把b转成十六进制
        String c = Integer.toHexString(b);
        System.out.println(c);
        System.out.println(String.valueOf(Integer.MIN_VALUE).substring(1));
    }


    @Test
    public void test() {

//        System.out.println(Integer.toString(24, 2));
//        String str = Integer.toString(24, 2);
//        // 把str转换成八位的二进制数
//        String str1 = String.format("%08d", Integer.parseInt(str));
//        System.out.println(str1);
        int k = 24;
        // 把k转换成八位的二进制数
        String str2 = String.format("%07d", Integer.parseInt(Integer.toString(k, 2)));
        System.out.println(str2);

        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
        System.out.println(new Date());
        // 创建2023-02-05 01:01:01.599的LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.of(2023, 2, 5, 1, 1, 1, 599000000);
        System.out.println(localDateTime);
    }

    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap();
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int totalCount = climbStairs(n - 1) + climbStairs(n - 2);
            System.out.println(totalCount);
            map.put(n, totalCount);
            return totalCount;
        }
    }

    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String args[]) throws InterruptedException {
//        Example ex = new Example();
//        ex.generateSQL();
////        ex.change(ex.str, ex.ch);
////        System.out.print(ex.str + " and ");
////        System.out.print(ex.ch);
//        System.out.println(ex.climbStairs(5));
        long date = new Date().getTime();
        String date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date - 1000 * 60 * 60 * 24 * 60L);
//        System.out.println(date1);

        Date d = new Date();
//        System.out.println(d.toString().split(" ")[0]);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        sleep(1000);
        System.out.println(LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        Solution solution = new Solution();
        String s = scanner.nextLine();
        while (!s.equals("exit")) {
            System.out.println(solution.myAtoi(s));
            s = scanner.nextLine();
        }
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }

    /**
     * 生成sql语句
     */
    void generateSQL() {
        File f = new File("C:/Users/xueaixin/Desktop/generate_sql1.sql");
        try {
            FileWriter writer = new FileWriter(f);
            String[] strings = {"A1", "A2"}; // 9列
            String[] strings1 = {"B1", "B2", "C1", "C2", "D1", "D2"}; // 12列
            String[] strings2 = {"E1", "E2"}; // 10列
            String[] strings3 = {"F1", "F2", "G1", "G2", "H1", "H2", "I1", "I2", "J1"}; // 12列
            String[] strings4 = {"J2"}; // 11列
            String[] strings5 = {"K1", "K2"}; // 12列
            String[] strings6 = {"L1", "L2", "M1", "M2", "N1", "N2"}; // 6列
            String[] strings7 = {"O1", "O2"}; // 4列
            String[] strings8 = {"O3"}; // 5列
            String[] strings9 = {"Q1", "S1", "Y1"}; // 15列
            justDoIt(strings, 9, writer);
            justDoIt(strings1, 12, writer);
            justDoIt(strings2, 10, writer);
            justDoIt(strings3, 12, writer);
            justDoIt(strings4, 11, writer);
            justDoIt(strings5, 12, writer);
            justDoIt(strings6, 6, writer);
            justDoIt(strings7, 4, writer);
            justDoIt(strings8, 5, writer);
            justDoIt(strings9, 15, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void justDoIt(String[] strings, int col, FileWriter writer) throws IOException {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= col; k++) {
                    for (int l = 1; l <= 2; l++) {
                        writer.write("INSERT INTO StorageDB_bjhs_2023_02_05.dbo.T_StorageBin(StorageBinCode, RackNum, LayerNum, ColumnNum, Bin, StorageID, UseFlag, Quantity) VALUES ('" +
                                strings[i] + "-" + j + "-" + k + "-" + l + "', '" + strings[i] + "', " + j + ", " + k + ", " + l + ", 1, 1, 0);\n");
                    }
                }
            }
        }
    }


}
