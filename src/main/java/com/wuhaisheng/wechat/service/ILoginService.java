package com.wuhaisheng.wechat.service;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:24
 */
public interface ILoginService {

    /**
     * 登陆
     * @return
     */
    boolean login();

    /**
     * 获取UUID
     * @param qrPath
     * @return
     */
    String getUuid();

    /**
     * 获取二维码图片
     * @param qrPath
     * @return
     */
    boolean getQR(String qrPath);

    /**
     * web初始化
     * @return
     */
    boolean webWxInit();

    /**
     * 微信状态通知
     */
    void wxStatusNotify();

    /**
     * 接收消息
     */
    void startReceiving();

    /**
     * 获取微信联系人
     */
    void webWxGetContact();

    /**
     * 批量获取联系人信息
     */
    void WebWxBatchGetContact();
}
