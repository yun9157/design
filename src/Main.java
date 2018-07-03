import cn.wy.design.visitor.BasicStaff;
import cn.wy.design.visitor.Manager;
import cn.wy.design.visitor.Staff;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Staff> staffs = new ArrayList<>();

        BasicStaff chef = new BasicStaff();
        chef.setName("厨师老王");
        chef.setWage(10);
        chef.setJob("厨子");

        BasicStaff store = new BasicStaff();
        store.setName("仓管小李");
        store.setWage(11);
        store.setJob("仓管");

        Manager manager = new Manager();
        manager.setName("店长贾富贵");
        manager.setWage(100);
        manager.setPerformance("本月营业额100w");

        staffs.add(chef);
        staffs.add(store);
        staffs.add(manager);

        staffs.forEach(Staff::report);
    }
}
