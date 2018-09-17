package cn.wy.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

        final static SerializableSingleton singleton = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonInstance.singleton;
    }


    private Object readResolve() throws ObjectStreamException {
        return SingletonInstance.singleton;
    }


    public static void main(String args[]) {
        try {

            SerializableSingleton sc1 = SerializableSingleton.getInstance();
            SerializableSingleton sc2 = SerializableSingleton.getInstance();
            System.out.println(sc1.equals(sc2)); // sc1

            Class<SerializableSingleton> singletonClass = (Class<SerializableSingleton>) Class
                            .forName("cn.wy.design.singleton.SerializableSingleton");

            Constructor<SerializableSingleton> c = singletonClass.getDeclaredConstructor(null);
            c.setAccessible(true); // 跳过权限检查
            SerializableSingleton sc3 = c.newInstance();
            SerializableSingleton sc4 = c.newInstance();

            System.out.println("是否为同一对象:" + sc3.equals(sc4));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
