package com.orz.mall.common;

import com.alibaba.fastjson.JSONObject;
import com.orz.mall.mall.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


/**
 * @author admin
 * @create 2020-09-05 18:43
 */
@ControllerAdvice
public class BaseGlobalResponseBodyAdvice implements ResponseBodyAdvice <Object> {

    private final static Logger LOGGER = LoggerFactory.getLogger(BaseGlobalResponseBodyAdvice.class);

    /**
     * 这个方法表示对于哪些请求要执行beforeBodyWrite，返回true执行，返回false不执行
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    /**
     * 对于返回的对象如果不是最终对象ResponseResult，则选包装一下
     * @param o
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        LOGGER.info("当前运行的类为"+methodParameter.getMethod().getClass().getName()+"类"+methodParameter.getMethod().getName()+"方法返回的数据为:"+ o);
        if (o instanceof ResponseResult){
            return ResponseResult.success(o);
        }else {
            return JSONObject.toJSON(ResponseResult.success(o));
        }
    }
}
