package com.zhangjian.servlet;

import com.zhangjian.utils.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class ServletContext {

    private ConcurrentHashMap<Object, Object> attribute;

    private static ServletContext servletContext;

    private ServletContext() {
        attribute = new ConcurrentHashMap<>();
    }

    public static ServletContext getServletContext() {
        Logger.log(ServletContext.class,"ServletContext执行初始化");
        if (servletContext == null) {
            Logger.log(ServletContext.class,"ServletContext为空，执行ServletContext实例");
            servletContext = new ServletContext();
        }else{
            Logger.log(ServletContext.class,"ServletContext不为空，不执行ServletContext实例");
        }
        return servletContext;
    }

    public void setAttribute(Object v1, Object v2) {
        attribute.put(v1, v2);
    }

    public Object getAttribute(Object var) {
        return attribute.get(var);
    }

    public void removeAttribute(Object var) {
        attribute.remove(var);
    }
}
