package com.wuhaisheng.wechat.utils;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-03-02 10:50
 */
public class SleepUtils {

    /**
     * 毫秒为单位
     * @param time
     */
    public static void sleep( long time ){
        try {
            Thread.sleep( time );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
