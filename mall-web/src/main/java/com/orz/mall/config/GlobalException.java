package com.orz.mall.config;

import com.orz.mall.mall.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 封装全局异常处理器
 * @author admin
 * @create 2020-09-05 18:21
 */
@ControllerAdvice
public class GlobalException {

    /**
     * 日志记录变量
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalException.class);

    /**
     * 封装运行时异常
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseResult runException(RuntimeException ex){
        LOGGER.info("代码运行出现了异常,异常信息为"+ex.getMessage());
        LOGGER.info("==================================request end=========================================");
        return ResponseResult.fail("接口调用失败!");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseResult allException(Exception ex){
        LOGGER.info("Exception---------------------报错了，exception"+ex.getMessage());
        LOGGER.info("==================================request end=========================================");
        return ResponseResult.fail();
    }
}
