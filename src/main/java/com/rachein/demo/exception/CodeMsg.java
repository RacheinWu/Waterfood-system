package com.rachein.demo.exception;

import lombok.Data;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/2/27 20:33
 */
@Data
public class CodeMsg {

    private int code;
    private String msg;

    //通用：
    public static CodeMsg SUCCESS = new CodeMsg(200, "success");
    public static CodeMsg BIND_ERROR = new CodeMsg(50001, "参数错误!");
    public static CodeMsg ERROR_SERVER = new CodeMsg(50002, "服务器错误!");

    //用户类 501xx:
    public static CodeMsg LOGIN_ERROR = new CodeMsg(50101, "账号或者密码错误!");
    public static CodeMsg PHONE_EXITED = new CodeMsg(50102, "该手机号已存在!");
    public static CodeMsg ACCOUNT_NOT_EXIT = new CodeMsg(50103, "用户不存在!");
    public static CodeMsg TOKEN_INVALID = new CodeMsg(50104, "认证失效，请重新登录!");

//    public static CodeMsg REGISTER_BIND = new CodeMsg(50104, "!");


    //查询类 503xx:
    public static CodeMsg QUERY_NOT_RESULT = new CodeMsg(50301, "查询无结果!");



    //物流类 502xx:
    public static CodeMsg LOGISTICS_NOT_EXIT = new CodeMsg(50201, "物流并不存在!");



    //传感器: 51xxx:
    public static CodeMsg DO_EXCEPTION = new CodeMsg(51101, "溶解氧数值异常！");
    public static CodeMsg AO_EXCEPTION = new CodeMsg(51102, "氨氮数值异常！");
    public static CodeMsg TEMP_EXCEPTION = new CodeMsg(51103, "温度数值异常！");
    public static CodeMsg LIFE_DIED = new CodeMsg(51104, "鱼类处于濒死状态！");



    public CodeMsg() {
    }

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回带参数的错误码
     */
    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    @Override
    public String toString() {
        return "CodeMsg [code=" + code + ", msg=" + msg + "]";
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
