package com.wuhaisheng.test.test2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wuhaisheng.wechat.beans.BaseMsg;
import com.wuhaisheng.wechat.core.Core;
import com.wuhaisheng.wechat.face.IMsgHandlerFace;
import com.wuhaisheng.wechat.utils.MyHttpClient;
import com.wuhaisheng.wechat.utils.enums.MsgTypeEnum;
import com.wuhaisheng.wechat.utils.tools.DownloadTools;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * 图灵机器人示例
 * @date 2018-03-02 16:50
 */
public class TulingRobot implements IMsgHandlerFace {

    Logger logger = Logger.getLogger("TulingRobot");
    MyHttpClient myHttpClient = Core.getInstance().getMyHttpClient();
    String url = "http://www.tuling123.com/openapi/api";
    String apiKey = "a50bc8a138fe4d8d80af75dc3b4c16d8";
    @Override
    public String textMsgHandle(BaseMsg msg) {
        String result = "";
        String text = msg.getText();
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("key", apiKey);
        paramMap.put("info", text);
        paramMap.put("userid", "123456");
        String paramStr = JSON.toJSONString(paramMap);
        try {
            HttpEntity entity = myHttpClient.doPost(url, paramStr);
            result = EntityUtils.toString(entity, "UTF-8");
            JSONObject obj = JSON.parseObject(result);
            if (obj.getString("code").equals("100000")) {
                result = obj.getString("text");
            } else {
                result = "处理有误";
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return result;
    }

    @Override
    public String picMsgHandle(BaseMsg msg) {
        return "收到图片";
    }

    @Override
    public String voiceMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String viedoMsgHandle(BaseMsg msg) {
        String fileName = String.valueOf(new Date().getTime());
        String voicePath = "D://itchat4j/voice" + File.separator + fileName + ".mp3";
        DownloadTools.getDownloadFn(msg, MsgTypeEnum.VOICE.getType(), voicePath);
        return "收到语音";
    }

    @Override
    public String nameCardMsgHandle(BaseMsg msg) {
        String fileName = String.valueOf(new Date().getTime());
        String viedoPath = "D://itchat4j/viedo" + File.separator + fileName + ".mp4";
        DownloadTools.getDownloadFn(msg, MsgTypeEnum.VIEDO.getType(), viedoPath);
        return "收到视频";
    }

    @Override
    public void sysMsgHandle(BaseMsg msg) {

    }

    @Override
    public String verifyAddFriendMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String mediaMsgHandle(BaseMsg msg) {
        return null;
    }
}
