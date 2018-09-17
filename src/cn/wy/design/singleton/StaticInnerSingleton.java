package cn.wy.design.singleton;

/**
 * Created by wang.yun on 2018/9/17.
 * 静态内部类单例模式
 */
public class StaticInnerSingleton {

    private static int count;

    private StaticInnerSingleton() {
        System.out.println("StaticInnerSingleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    private static class SingletonInstance {

        final static StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonInstance.singleton;
    }


    public static void main(String args[]) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                StaticInnerSingleton singleton = StaticInnerSingleton.getInstance();
                System.out.println("线程 " + threadName + "\t => " + singleton.hashCode());
            }
        };
        for (int i = 0; i <= 100; i++) {
            new Thread(task, "" + i).start();
        }
    }
}
