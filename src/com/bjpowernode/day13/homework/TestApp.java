package com.bjpowernode.day13.homework;

public class TestApp {
    public static void main(String[] args) {
        // 创建一个文章的对象
        Article article = new Article("文章标题...","文章内容...");
        article.info();

        System.out.println("-----------");

        News news = new News("新闻标题...","新闻内容...","1111","2222");
        news.info();

        System.out.println("-------------------");


        UserGroup userGroup = new UserGroup("管理员","系统管理员");

        User user = new User("jack","138","123","jack","logo",userGroup);

        System.out.println(user.getUserGroup().getName());
        System.out.println(user.getUserGroup().getDesc());
    }
}
