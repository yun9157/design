package cn.wy.design.prototype;

/**
 * Created by wang.yun on 2019/3/14.
 */
public class ConcretePrototype extends Prototype {

    public void print() {
        System.out.println("原型模式实现类:hashcode" + this.hashCode());
    }
}
