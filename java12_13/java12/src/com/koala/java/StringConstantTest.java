package com.koala.java;

import java.util.Optional;

/**
 * day02：常量API
 * Create by koala on 2021-08-09
 */
public class StringConstantTest {

    public static void main(String[] args) {
        testDescribeConstable();
    }

    private static void testDescribeConstable() {
        System.out.println("======test java 12 describeConstable======");
        String name = "尚硅谷Java高级工程师";
        Optional<String> optional = name.describeConstable();
        System.out.println(optional.get());
    }

}
