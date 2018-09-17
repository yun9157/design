package cn.wy.design.singleton;

/**
 * Created by wang.yun on 2018/9/14.
 * 饿汉单例
 */
public class HungrySingleton {

    private static int count;

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("HungrySingleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }


    public static void main(String args[]) {
        Runnable task = new Runnable() {
            @Override
            public void run() {

                String threadName = Thread.currentThread().getName();
                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                System.out.println("线程 " + threadName + "\t => " + hungrySingleton.hashCode());
            }
        };
        for (int i = 0; i <= 10; i++) {
            new Thread(task).start();
        }
    }
}