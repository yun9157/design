package cn.wy.design.observer;

/**
 * Created by wang.yun on 2019/3/13.
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String message);

}
