package com.wuhaisheng.wechat.utils.enums;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 10:55
 */
public enum MsgTypeEnum {

    TEXT("Text", "文本消息"),
    PIC("Pic", "图片消息"),
    VOICE("Voice", "语音消息"),
    VIEDO("Viedo", "小视频消息"),
    NAMECARD("NameCard", "名片消息"),
    SYS("Sys", "系统消息"),
    VERIFYMSG("VerifyMsg", "添加好友"),
    MEDIA("app", "文件消息");

    private String type;
    private String code;

    MsgTypeEnum(String type, String code) {
        this.type = type;
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }
}
