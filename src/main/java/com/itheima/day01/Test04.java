package com.itheima.day01;

/**
 * 利用同步代码块解决同步问题
 * Date: 2018/12/1
 * Time: 16:05
 */
public class Test04 {
    public static void main(String[] args) {
        MyTicket m = new MyTicket();
         Thread th = new Thread(m,"1");
         Thread th1 = new Thread(m,"2");
         Thread th2 = new Thread(m,"3");
         th.start();
         th1.start();
         th2.start();
    }
}
class MyTicket implements Runnable{
    private Integer ticket = 100;

    Object ob = new Object();


    public void run() {
        while(true){
            synchronized (ob){
            if (ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖第:"+ticket--);
                }
            }
        }
    }
}
