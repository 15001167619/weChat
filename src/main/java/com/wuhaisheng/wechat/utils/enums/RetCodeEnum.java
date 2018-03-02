package com.wuhaisheng.wechat.utils.enums;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 10:57
 */
public enum RetCodeEnum {
    NORMAL("0", "普通"),
    LOGIN_OUT("1102", "退出"),
    LOGIN_OTHERWHERE("1101", "其它地方登陆"),
    MOBILE_LOGIN_OUT("1102", "移动端退出"),
    UNKOWN("9999", "未知");


    private String code;
    private String type;

    RetCodeEnum(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

}
