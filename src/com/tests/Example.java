package com.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Example {

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

    public static void main(String args[]) {
        Example ex = new Example();
        ex.generateSQL();
////        ex.change(ex.str, ex.ch);
////        System.out.print(ex.str + " and ");
////        System.out.print(ex.ch);
//        System.out.println(ex.climbStairs(5));
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';
    }

    /**
     * 生成sql语句
     */
    void generateSQL() {
        File f = new File("C:/Users/xueaixin/Desktop/generate_sql.sql");
        try {
            FileWriter writer = new FileWriter(f);
            String[] strings = {"A1", "A2", "B1", "B2", "C1", "C2", "D1", "D2", "E1", "E2", "F1", "F2", "G1", "G2", "H1", "H2",
                    "I1", "I2", "J1", "J2", "K1", "K2", "L1", "L2", "M1", "M2", "N1", "N2", "O1", "O2", "O3", "P1", "Q2", "R1", "R2",
                    "S1", "T1", "T2", "U1", "U2", "V1", "V2", "W1", "W2", "X1", "X2", "Y1", "Z1", "Z2", "AB", "AC", "AD", "AE", "AF", "AG"};
            for (int i = 0; i < strings.length; i++) {
                for (int j = 1; j <= 3; j++) {
                    for (int k = 1; k <= 12; k++) {
                        for (int l = 1; l <= 2; l++) {
                            writer.write("INSERT INTO StorageDB_bjhs_2023_02_05.dbo.T_StorageBin(StorageBinCode, RackNum, StoreyNum, ColumnNum, StorageID) VALUES ('" +
                                    strings[i] + "-" + j + "-" + k + "-" + l + "', '" + strings[i] + "', " + j + ", " + k + ", 1);\n");
                        }
                    }
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
