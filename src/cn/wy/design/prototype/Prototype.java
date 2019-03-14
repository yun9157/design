package cn.wy.design.prototype;

/**
 * Created by wang.yun on 2019/3/14.
 */
public class Prototype implements Cloneable {

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
