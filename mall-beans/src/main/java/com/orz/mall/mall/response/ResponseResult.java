package com.orz.mall.mall.response;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 封装统一结果返回出参对象
 * @author admin
 * @create 2020-09-05 17:47
 */
@Data
public class ResponseResult implements Serializable{

    private String code;

    private String msg;

    private Object data;


    /**
     * 重新构造方法:返回成功信息和成功数据
     * @param data
     */
    public static ResponseResult success(Object data){
        ResponseResult result = new ResponseResult();
        result.setCode(ResultCode.SUCCESS);
        result.setMsg(ResultCode.SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    /**
     * 构造异常处理方法:当接口调用失败时返回一个空的map对象
     * @return
     */
    public static ResponseResult fail(){
        ResponseResult result = new ResponseResult();
        result.setCode(ResultCode.FAIL);
        result.setMsg(ResultCode.FAIL_MSG);
        //如果失败就返回一个空的HashMap
        result.setData(new HashMap<>());
        return result;
    }

    /**
     * 构造异常处理方法:传入失败信息
     * @return
     */
    public static ResponseResult fail(String msg){
        ResponseResult result = new ResponseResult();
        result.setCode(ResultCode.FAIL);
        result.setMsg(msg);
        //如果失败就返回一个空的HashMap
        result.setData(new HashMap<>());
        return result;
    }
}
