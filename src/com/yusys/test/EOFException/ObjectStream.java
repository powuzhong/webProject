package com.yusys.test.EOFException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by lt on 2018/11/21.
 */
public class ObjectStream {
    public static void main(String[] args) throws Exception {
        User user1 = new User("yiwangzhibujian", 27);




        User user2 = new User("laizhezhikezhui", 24);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(user1);
        oos.writeObject(user2);
        oos.writeObject(null);

        byte[] data = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bis);

        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
    }
}

