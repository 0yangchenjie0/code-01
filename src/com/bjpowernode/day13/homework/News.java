package com.bjpowernode.day13.homework;

public class News extends Article {

    public News(String title, String content, String subTitle, String createTime) {
        super(title, content); // 调用父类的构造方法
        this.subTitle = subTitle;
        this.createTime = createTime;
    }

    private String subTitle; // 新闻的副标题
    private String createTime; // 新闻的创建时间

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    @Override
    public void info() {
        super.info(); // 调用父类的方法
        System.out.println("subTitle:" + this.subTitle);
        System.out.println("createTime:" + this.createTime);
    }
}
