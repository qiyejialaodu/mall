package com.orz.mall.mall.response;

/**
 * 封装响应状态码常量
 * @author admin
 * @create 2020-09-05 18:06
 */
public class ResultCode {

    /** 成功 */
    public static final String SUCCESS = "200";

    public static final String SUCCESS_MSG = "成功!";

    public static final String EMPTY_MSG = "暂无信息!";

    /** 失败 */
    public static final String FAIL = "400";

    public static final String FAIL_MSG = "失败!";
    /** 未登录 */
    public static final String UNAUTHORIZED = "401";
    /** 请求被拒绝 */
    public static final String FORBIDDEN = "403";
    /** 未找到接口 */
    public static final String NOT_FOUND = "404";
    /** 服务器内部错误 */
    public static final String INTERNAL_SERVER_ERROR = "500";
}
