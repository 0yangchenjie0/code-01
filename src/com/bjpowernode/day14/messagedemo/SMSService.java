package com.bjpowernode.day14.messagedemo;

/**
 * 短信服务接口
 *
 */
public interface SMSService {

    /**
     * 发送短信
     * @param mobile
     * @param content
     */
    void sendSMS(String mobile,String content);

}
