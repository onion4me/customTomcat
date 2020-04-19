package com.zhangjian.servlet;

import java.util.HashMap;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class Header {
    private String url;

    private String method;

    private HashMap<String,String> params;

    public Header(){
        params = new HashMap<>();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public void setParams(String var1 , String var2){
        params.put(var1,var2);
    }
    public String getParam(String var){
        return params.get(var);
    }
}
