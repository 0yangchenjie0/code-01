package com.bjpowernode.day11;

public class NewsApp {

    public static void main(String[] args) {
//        News news = new News();
//        news.title = "测试新闻";
//        news.url = "https://www.baidu.com";
//        news.sort = 1;
//        news.showTag = true;
//        System.out.println(news.showTag);

//        News news = new News();
//        news.title = "测试";
//        m1(news);

        // 匿名对象作为方法参数
        m1(new News());
    }

    public static void m1(News news) {
        news.title = "测试";
        System.out.println(news.title);
    }

}


class News {

    // 成员变量
    String title; // 新闻标题
    String url;   // 新闻链接
    int sort;     // 展示顺序
    boolean showTag; // 是否展示热点标签

    void info(String a) {
        int i = 100; // 局部变量 使用之前必须赋值
        System.out.println(i);
    }
}
