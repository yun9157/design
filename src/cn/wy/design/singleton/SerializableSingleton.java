package cn.wy.design.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by wang.yun on 2018/9/17.
 * 序列化单例
 */
public class SerializableSingleton implements Serializable {

    private static int count;

    private SerializableSingleton() {
        System.out.println("SerializableSingleton 私有的构造方法被实例化 " + (++count) + " 次。");

    }

    private static class SingletonInstance {

        private final static SerializableSingleton singleton = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonInstance.singleton;
    }


    private Object readResolve() throws ObjectStreamException {
        return SingletonInstance.singleton;
    }


    public static void main(String args[]) {
        try {

            // 序列化
            ObjectOutputStream oos = new ObjectOutputStream(
                            new FileOutputStream("storageFile"));
            oos.writeObject(SerializableSingleton.getInstance());

            //反序列化
            File file = new File("storageFile");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            SerializableSingleton newInstance = (SerializableSingleton) ois.readObject();

            System.out.println("是否为同一个对象:" + newInstance.equals(SerializableSingleton.getInstance()));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
