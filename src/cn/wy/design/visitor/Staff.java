package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public abstract class Staff {

    private String name;
    private int wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public abstract void accept(VisitorInter visitor);
}
