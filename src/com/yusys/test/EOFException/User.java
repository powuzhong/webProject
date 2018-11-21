package com.yusys.test.EOFException;

/**
 * Created by lt on 2018/11/21.
 */
public class User {
    public int age;
    public String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
