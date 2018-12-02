package com.itheima.day01;

/**
 * Date: 2018/11/30
 * Time: 20:30
 */
public class Test03 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }


}
class Ticket implements Runnable{
    private int ticket=100;



    public void run() {


        while(true){

            if (ticket > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖"+ticket--);
            }
        }
    }
}
