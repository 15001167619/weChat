package com.wuhaisheng.wechat.utils.enums.parameters;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:02
 */
public enum LoginParaEnum {

    LOGIN_ICON("loginicon", "true"),
    UUID("uuid", ""),
    TIP("tip", "0"),
    R("r", ""),
    _("_", "");

    private String para;
    private String value;

    LoginParaEnum(String para, String value) {
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
