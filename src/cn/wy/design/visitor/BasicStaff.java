package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public class BasicStaff extends Staff {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(VisitorInter visitor) {
        visitor.visit(this);
    }
}
