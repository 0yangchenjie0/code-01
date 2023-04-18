package com.bjpowernode.day18;

/**
 * 用户名密码登录
 * 登录：(内置账号 jack 1234)
 * 用户名不存在 抛出 UsernameNotFoundException  errorCode - 1001
 * 密码错误  抛出 PasswordErrorException       errorCode - 1002
 */
public class CustomExceptionDemo02 {

    public static void main(String[] args) {
        try {
            login("jack", "1234");
        } catch (UsernameNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e.getErrorCode() + ":" + e.getMessage());
        } catch (PasswordErrorException e) {
            // e.printStackTrace();
            System.out.println(e.getErrorCode() + ":"  + e.getMessage());
        }
    }

    /**
     * 用户名密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @throws UsernameNotFoundException 用户名不存在
     * @throws PasswordErrorException    密码错误
     */
    public static void login(String username, String password) throws UsernameNotFoundException, PasswordErrorException {
        if (!"jack".equals(username)) {
            // 抛出用户名不存在的异常
            throw new UsernameNotFoundException(1001, "用户名不存在");
        }
        if (!"1234".equals(password)) {
            // 抛出密码错误
            throw new PasswordErrorException(1002, "密码错误");
        }
        System.out.println("登录成功...");
    }
}

class UsernameNotFoundException extends Exception {

    private int errorCode;
    public UsernameNotFoundException(int errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }

}


class PasswordErrorException extends Exception {

    private int errorCode;
    public PasswordErrorException(int errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }

}
