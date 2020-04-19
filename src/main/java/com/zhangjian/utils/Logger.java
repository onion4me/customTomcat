package com.zhangjian.utils;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/19
 */
public class Logger {

    public static void log(Class clazz,String info){

        System.out.printf("所在的类:%s:,所在的方法:%s,输出的内容:%s",
                clazz.getName(),
                Thread.currentThread().getStackTrace()[2].getMethodName(),
                info);

        System.out.println();

    }
}
