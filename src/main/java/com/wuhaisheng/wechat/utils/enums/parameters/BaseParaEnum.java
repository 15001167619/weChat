package com.wuhaisheng.wechat.utils.enums.parameters;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:02
 */
public enum BaseParaEnum {

    Uin("Uin", "wxuin"),
    Sid("Sid", "wxsid"),
    Skey("Skey", "skey"),
    DeviceID("DeviceID", "pass_ticket");

    private String para;
    private String value;

    BaseParaEnum(String para, String value) {
        this.para = para;
        this.value = value;
    }

    public String para() {
        return para;
    }


    public Object value() {
        return value;
    }

}
