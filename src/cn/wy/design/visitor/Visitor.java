package cn.wy.design.visitor;

/**
 * Created by wang.yun on 2018/7/3.
 */
public class Visitor implements VisitorInter {


    @Override
    public void visit(BasicStaff basicStaff) {
        System.out.println(this.getBasicStaffInfo(basicStaff));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBaseInfo(Staff staff) {
        return "姓名：" + staff.getName() + "  工资:" + staff.getWage();
    }

    private String getBasicStaffInfo(BasicStaff basicStaff) {
        return this.getBaseInfo(basicStaff) + "  工作：" + basicStaff.getJob();
    }

    private String getManagerInfo(Manager manager) {
        return this.getBaseInfo(manager) + "  绩效：" + manager.getPerformance();
    }
}
