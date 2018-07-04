package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public class Manager extends Staff {

    private String performance;

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }

    @Override
    public void accept(VisitorInter visitor) {
        visitor.visit(this);
    }
}
