package com.wuhaisheng.wechat.utils.enums;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 10:56
 */
public enum ResultEnum {
    SUCCESS("200", "成功"),
    WAIT_CONFIRM("201", "请在手机上点击确认"),
    WAIT_SCAN("400", "请扫描二维码");

    private String code;
    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
}
