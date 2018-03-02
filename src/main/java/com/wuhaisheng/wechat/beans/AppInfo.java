package com.wuhaisheng.wechat.beans;

import java.io.Serializable;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:16
 */
public class AppInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int type;
    private String appId;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
