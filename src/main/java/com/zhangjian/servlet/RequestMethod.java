package com.zhangjian.servlet;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public interface RequestMethod {
    void doGet(Request request,Response response);
    void doPost(Request request,Response response);
}
