package com.wuhaisheng.test.test1;

import com.alibaba.fastjson.JSONObject;
import com.wuhaisheng.wechat.Wechat;
import com.wuhaisheng.wechat.api.WechatTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 13:27
 */
public class MyTest {

    private static final Logger LOG = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        String qrPath = "D://itchat4j//login"; // 保存登陆二维码图片的路径
        new Wechat(new SimpleDemo(), qrPath).start();
        LOG.info("+++++++++++++++++++获取好友数量+++++++++++++++++++++");
        List<JSONObject> contactList = WechatTools.getContactList();
        String msg ="张灯结彩月儿圆，又到元宵佳节时;花灯俏俏惹人爱，汤圆香香诱人馋;缤纷烟花洒吉祥，" +
                "喜笑颜开福无边;送份祝福表心意，情浓谊厚心舒畅;慕小谦祝你元宵节开心，幸福快乐爽歪歪!";//元宵节祝福文案
        LOG.info("好友数量"+contactList.size());
      /*  for (JSONObject jsonObject:contactList) {
            WechatTools.sendMsgByUserName(msg,jsonObject.getString("UserName"));
        }*/
    }
}
