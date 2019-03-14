package cn.wy.design.prototype;

/**
 * Created by wang.yun on 2019/3/14.
 */
public class Test {

    public static void main(String args[]) throws CloneNotSupportedException {

        long startTime = System.currentTimeMillis();
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for (int i = 0; i < 10000; i++) {
            ConcretePrototype prototype = (ConcretePrototype) concretePrototype.clone();
            prototype.print();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("原型模式花费时间:" + (endTime - startTime));

        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ConcretePrototype newConcretePrototype = new ConcretePrototype();
            newConcretePrototype.print();
        }
        long finishTime = System.currentTimeMillis();

        System.out.println("传统花费时间:" + (finishTime - beginTime));
    }
}
