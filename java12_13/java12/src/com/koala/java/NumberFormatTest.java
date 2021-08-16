package com.koala.java;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * day03：支持压缩数字格式化
 * Create by koala on 2021-08-09
 */
public class NumberFormatTest {

    @Test
    public void testCompactNumberFormat() {
        var cnf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1_0000));
        System.out.println(cnf.format(1_9200));
        System.out.println(cnf.format(1_000_000));
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1L << 50));
    }

}
