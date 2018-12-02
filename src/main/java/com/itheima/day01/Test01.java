package com.itheima.day01;

/**
 * 需求: n的阶乘
 *  10*9*...*1
 * Date: 2018/11/30
 * Time: 19:32
 */
public class Test01 {
    public static void main(String[] args) {
        long num = getNum(5);
        System.out.println(num);


    }

    private static long getNum(int i) {
        if (i==1){
            return 1;
        }
        return i*getNum(i-1);
    }

}
