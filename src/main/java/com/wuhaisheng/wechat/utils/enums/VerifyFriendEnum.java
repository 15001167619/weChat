package com.wuhaisheng.wechat.utils.enums;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 10:59
 */
public enum VerifyFriendEnum {

    ADD(2, "添加"),
    ACCEPT(3, "接受");

    private int code;
    private String desc;

    private VerifyFriendEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }
}
