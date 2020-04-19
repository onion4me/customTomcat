package com.zhangjian.servlet;

import com.zhangjian.config.Constant;
import com.zhangjian.utils.Logger;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public abstract class HttpServlet implements Servlet,RequestMethod,ServletConfig{

    @Override
    public void init(ServletConfig servletConfig) {

    }

    @Override
    public void service(Request var1, Response var2) throws Exception{
        if (var1.getHeader().getMethod().equals(Constant.METHOD_GET)){
            doGet(var1,var2);
        }
        if (var1.getHeader().getMethod().equals(Constant.METHOD_POST)){
            doPost(var1,var2);
        }
    }

    @Override
    public String getServletInfo() {
        return "abc";
    }
    @Override
    public void demise() {

    }

    @Override
    public ServletContext getServletContext() {
        return ServletContext.getServletContext();
    }
}
