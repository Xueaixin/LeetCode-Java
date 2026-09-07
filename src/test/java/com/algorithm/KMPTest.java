package com.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class KMPTest {

    private KMP kmp;

    @BeforeEach
    void setUp() {
        kmp = new KMP();
    }

    @Test
    void getNext() {
        String str = "acbabacbacac";
        System.out.println(Arrays.toString(kmp.getNext(str)));
    }

    @Test
    void match() {
        String s = "ababcabcacbab";
        String t = "abcac";
        System.out.println(kmp.match(s, t, kmp.getNext(t)));
    }
}