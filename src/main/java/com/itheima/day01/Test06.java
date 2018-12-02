package com.itheima.day01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Date: 2018/12/1
 * Time: 16:47
 */
public class Test06 {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        Thread tg = new Thread(t,"1");
        Thread tg1 = new Thread(t,"2");
        Thread tg2 = new Thread(t,"3");
        tg.start();
        tg1.start();
        tg2.start();

    }
}
class Tickets implements Runnable{

    private Integer tickets=100;
    Lock lo = new ReentrantLock();
    public void run() {
        while(true){
            lo.lock();
            if (tickets>0){
                try {
                    Thread.sleep(12);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(tickets--);
            }
        }
    }
}