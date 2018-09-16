package cn.wy.design.chainofresponsibility;

/**
 * Created by wang.yun on 2018/9/6.
 */
public abstract class Leader {

    public String name;

    public Leader next;


    public abstract void handleRequest();
}
