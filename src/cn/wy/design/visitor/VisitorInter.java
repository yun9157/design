package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public interface VisitorInter {

    void visit(BasicStaff basicStaff);

    void visit(Manager manager);
}
