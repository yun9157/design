package cn.wy.design.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by wang.yun on 2019/3/14.
 */
public class SemaphoreTest {

    public static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        final Semaphore semaphore = new Semaphore(1);
        for (int i = 0; i < 3; i++) {
            int index = i;
            new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            semaphore.acquire();
                            System.out.println("thread" + index + ": " + result++);
                            if (result > 100) {
                                System.exit(0);
                                System.exit(0);
                            }
                            semaphore.release();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }
}
