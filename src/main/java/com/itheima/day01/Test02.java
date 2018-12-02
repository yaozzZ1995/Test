package com.itheima.day01;

/**
 * 多线程的实现方式1:继承Thread类
 * Date: 2018/11/30
 * Time: 19:58
 */
public class Test02 {


   /* public static void main(String[] args) {
        System.out.println("main线程");
        Test02 ts = new Test02();
        ts.setName("zs");
        ts.start();
        for (int i = 0; i < 20000; i++) {
            System.out.println("main"+i);

        }

    }
    @Override
    public void run() {
        for(int i=0;i<20000;i++){
            System.out.println(i);
        }
    }*/
   public static void main(String[] args) {
       System.out.println("main线程");
       MyThread myThread = new MyThread();
       myThread.start();
       for (int i = 0; i < 20000; i++) {

           System.out.println("main"+i);
       }
   }

}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<20000;i++){
            System.out.println(i);
        }
    }
}

