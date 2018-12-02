package com.itheima.day01;

/**
 * Date: 2018/12/1
 * Time: 16:22
 */
public class Test05 {
    public static void main(String[] args) {
         MyTickets t = new MyTickets();
         Thread th = new Thread(t,"1");
         Thread th1 = new Thread(t,"2");
         Thread th2= new Thread(t,"3");
         th.start();
         th1.start();
         th2.start();
    }
}

class MyTickets implements Runnable {
    private Integer tickets = 100;



    public void run() {
            while (true){
                getSyn();
            }
    }

    public synchronized void getSyn(){
        if (tickets>0){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Thread.currentThread().getName()+" "+tickets--);
        }
    }
}
