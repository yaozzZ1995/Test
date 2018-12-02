package com.itheima.day02;

/**
 * 654,321
 */

import java.util.Scanner;
/**
 * 654,321
 */

/**
 * Date: 2018/12/1
 * Time: 19:29
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一串数字： ");
        Scanner in = new Scanner(System.in);
        String num = in.next();
        StringBuffer sb = new StringBuffer(num);
        int len = sb.length();
        int b = len / 3;
        if (len % 3 == 0) {
            b = b - 1;
        }
        for (int i = 0; i < b; i++) {
            sb.insert(len - 3 * (i + 1), ",");
        }
        System.out.println(sb.toString());
        System.out.println('a');

    }


}