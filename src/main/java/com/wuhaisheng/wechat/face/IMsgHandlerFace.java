package com.wuhaisheng.wechat.face;

import com.wuhaisheng.wechat.beans.BaseMsg;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 11:21
 */
public interface IMsgHandlerFace {

    /**
     * @param msg
     * @return
     */
    public String textMsgHandle(BaseMsg msg);

    /**
     * 处理图片消息
     * @param msg
     * @return
     */
    public String picMsgHandle(BaseMsg msg);

    /**
     * 处理声音消息
     * @param msg
     * @return
     */
    public String voiceMsgHandle(BaseMsg msg);

    /**
     * 处理小视频消息
     * @param msg
     * @return
     */
    public String viedoMsgHandle(BaseMsg msg);

    /**
     * 处理名片消息
     * @param msg
     * @return
     */
    public String nameCardMsgHandle(BaseMsg msg);

    /**
     * 处理系统消息
     * @param msg
     * @return
     */
    public void sysMsgHandle(BaseMsg msg);

    /**
     * 处理确认添加好友消息
     * @param msg
     * @return
     */
    public String verifyAddFriendMsgHandle(BaseMsg msg);

    /**
     * 处理收到的文件消息
     * @param msg
     * @return
     */
    public String mediaMsgHandle(BaseMsg msg);
}
