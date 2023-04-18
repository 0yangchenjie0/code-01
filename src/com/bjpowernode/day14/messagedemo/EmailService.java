package com.bjpowernode.day14.messagedemo;

/**
 * 邮件服务接口
 *
 * QQ邮箱
 * 网易126
 * 网易163
 *
 * 邮箱服务器
 *
 * 发件人邮箱 -- 邮件服务器 --- 收件人邮箱
 * QQ          网易           QQ
 */
public interface EmailService {

    /**
     * 发送邮件接口
     * @param toEmail 收件人邮箱
     * @param content 邮件的内容
     */
    void sendEmail(String toEmail,String content);
}
