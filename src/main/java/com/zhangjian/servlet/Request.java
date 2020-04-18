package com.zhangjian.servlet;

import java.io.InputStream;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class Request {
    private Header header;

    public Request(InputStream inputStream){
        byte[] buffer = new byte[1024];
        int length = 0;
        
    }
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
