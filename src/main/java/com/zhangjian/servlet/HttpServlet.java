package com.zhangjian.servlet;

import com.zhangjian.config.Constant;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class HttpServlet implements Servlet,RequestMethod{

    @Override
    public void init(ServletConfig servletConfig) {

    }

    @Override
    public void service(Request var1, Response var2) {
        if (var1.getHeader().getMethod().equals(Constant.METHOD_GET)){
            doGet(var1,var2);
        }
        if (var1.getHeader().getMethod().equals(Constant.METHOD_POST)){
            doPost(var1,var2);
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void demise() {

    }

    @Override
    public void doGet(Request request, Response response) {

    }

    @Override
    public void doPost(Request request, Response response) {

    }
}
