package com.zhangjian.servlet;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class Header {
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
