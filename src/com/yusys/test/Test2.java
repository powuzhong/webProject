package com.yusys.test;

/**
 * Created by lt on 2018/11/18.
 */
public class Test2 {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a.equals(c)));
        System.out.println((a.equals(e)));
        //System.out.println(TestFinal.a);
    }
}
