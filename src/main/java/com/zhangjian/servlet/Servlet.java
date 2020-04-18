package com.zhangjian.servlet;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public interface Servlet {
    /** 初始化 */
    void init(ServletConfig servletConfig);
    /** 逻辑处理 */
    void service(Request var1,Response var2);
    /** 捕捉信息 */
    String getServletInfo();
    /** 销毁 */
    void demise();
}
