package com.wuhaisheng.wechat.utils.enums.parameters;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:03
 */
public enum StatusNotifyParaEnum {

    CODE("Code", "3"),
    FROM_USERNAME("FromUserName", ""),
    TO_USERNAME("ToUserName", ""),
    CLIENT_MSG_ID("ClientMsgId", ""); //时间戳

    private String para;
    private String value;

    StatusNotifyParaEnum(String para, String value) {
        this.para = para;
        this.value = value;
    }

    public String para() {
        return para;
    }

    public String value() {
        return value;
    }
}
