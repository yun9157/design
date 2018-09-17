package cn.wy.design.singleton;

/**
 * Created by wang.yun on 2018/9/17.
 * 枚举单例
 */
enum SingletonEnum {
    INSTANCE;

    private Single instance;

    SingletonEnum() {
        instance = new Single();
    }

    public Single getInstance() {
        return instance;
    }

    public static void main(String args[]) {
        Single single1 = SingletonEnum.INSTANCE.getInstance();
        Single single2 = SingletonEnum.INSTANCE.getInstance();
        System.out.println(single1.equals(single2));
    }
}


class Single {

    private static int count;

    public Single() {
        System.out.println("Single私有的构造方法被实例化 " + (++count) + " 次。");
    }

}


