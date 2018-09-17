package cn.wy.design.singleton;

/**
 * Created by wang.yun on 2018/9/14.
 * 懒汉单例
 */
public class LazySingleton {

    private static LazySingleton instance = null;
    private static int count;

    LazySingleton() {
        System.out.println("LazySingleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }


    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new LazySingleton();
        }
        return instance;
    }


    public static void main(String args[]) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                LazySingleton s1 = LazySingleton.getInstance();
                System.out.println("线程 " + threadName + "\t => " + s1.hashCode());
            }
        };
        for (int i = 0; i <= 100; i++) {
            new Thread(task, "" + i).start();
        }
    }
}