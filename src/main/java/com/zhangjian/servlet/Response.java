package com.zhangjian.servlet;

import com.zhangjian.utils.Logger;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.LogManager;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/18
 */
public class Response {

    private OutputStream outputStream;

    public Response(OutputStream outputStream) {
        Logger.log(this.getClass(),"response 构造方法被触发，传入OutputStream"+outputStream);
        this.outputStream = outputStream;
    }

    public void sendResponse(String resource){
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\\n");
//        httpResponse.append("Content-Type:text/html\n");
        httpResponse.append("\r\n");
        httpResponse.append(resource);
        try {
            outputStream.write(httpResponse.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
