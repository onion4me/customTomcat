package com.zhangjian.config;

import com.zhangjian.servlet.Request;
import com.zhangjian.servlet.Response;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/19
 */
public interface BootStrapMapping {
    void start();
    void init(ServletMappingConfig servletMappingConfig);
    void dispatch(Request request, Response response) throws Exception;
}
