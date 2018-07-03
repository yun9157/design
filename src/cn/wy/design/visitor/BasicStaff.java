package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public class BasicStaff extends Staff {

    private String job;

    public String setJob(String job) {
        return job;
    }

    @Override
    protected String getOtherInfo() {
        return "工作:" + job;
    }
}
