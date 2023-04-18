package com.bjpowernode.day14.messagedemo;

/**
 * 一个类可以实现多个接口
 */
public class UserService01 implements SMSService, EmailService {

    /**
     * 用户注册
     * 注册成功后，发送一个短信提醒到用户手机
     *
     * @param username 用户名
     * @param mobile   手机号
     * @param email    邮箱
     */
    public void register(String username, String mobile, String email) {
        System.out.println(username + "：注册成功");
        // 发送短信
        sendSMS(mobile, "注册成功");
        // 发送邮件
        sendEmail(email, "注册成功");
    }

    @Override
    public void sendSMS(String mobile, String content) {
        System.out.println("给【" + mobile + "】发送短信：" + content);
    }

    @Override
    public void sendEmail(String toEmail, String content) {
        System.out.println("给【" + toEmail + "】发送邮件：" + content);
    }

    public static void main(String[] args) {
        UserService01 userService = new UserService01();
        userService.register("jack", "135", "126@com");
    }


}
