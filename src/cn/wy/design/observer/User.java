package cn.wy.design.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wang.yun on 2019/3/13.
 */
public class User implements Observable, Observer {

    private List<Observer> friends;
    private String name;

    public User(String name) {
        this.name = name;
        this.friends = new LinkedList<>();
    }


    public void sendMessage(String message) {
        this.notifyObservers(message);
    }

    @Override
    public void addObserver(Observer observer) {
        this.friends.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.friends.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : friends) {
            observer.receiveMsg(this.name, message);
        }
    }

    @Override
    public void receiveMsg(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
    }
}
