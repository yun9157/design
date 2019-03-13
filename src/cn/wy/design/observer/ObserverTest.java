package cn.wy.design.observer;

/**
 * Created by wang.yun on 2019/3/13.
 * 朋友圈举例
 * 参考网站：https://my.oschina.net/liebrother/blog/3020463
 */
public class ObserverTest {

    public static void main(String[] args) {
        User xiaoMing = new User("小明");
        User xiaoHong = new User("小红");
        User xiaoDong = new User("小东");
        xiaoMing.addObserver(xiaoHong);
        xiaoMing.addObserver(xiaoDong);
//        xiaoMing.removeObserver(xiaoHong);
        xiaoMing.sendMessage("今天真开心");
        // 小红和小明闹别扭了，小红取消订阅小明的朋友圈

//         xiaoMing.sendMessage("希望明天也像今天一样开心");
    }

}