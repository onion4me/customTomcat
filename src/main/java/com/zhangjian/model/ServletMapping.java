package com.zhangjian.model;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class ServletMapping {

    private String servletName;
    private String servletUrl;
    private String servletClass;

    public ServletMapping() {
    }

    public ServletMapping(String servletName, String servletUrl, String servletClass) {
        this.servletName = servletName;
        this.servletUrl = servletUrl;
        this.servletClass = servletClass;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getServletUrl() {
        return servletUrl;
    }

    public void setServletUrl(String servletUrl) {
        this.servletUrl = servletUrl;
    }

    public String getServletClass() {
        return servletClass;
    }

    public void setServletClass(String servletClass) {
        this.servletClass = servletClass;
    }
}
