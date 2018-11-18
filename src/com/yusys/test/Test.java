package com.yusys.test;

import java.math.BigDecimal;

/**
 * Created by lt on 2018/11/18.
 */
public class Test {

    public static void main(String[] args) {
//        BigDecimal temp = new BigDecimal();
        BigDecimal a = new BigDecimal("8");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = a.add(b);
        System.out.println(c);
        add(1, 2);
/*        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(a);
        }*/
    }


    public static int add(int a, int b) {
        div(a,b);
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}
