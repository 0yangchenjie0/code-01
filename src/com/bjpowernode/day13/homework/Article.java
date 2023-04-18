package com.bjpowernode.day13.homework;

public class Article {

    public Article() {

    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    private String title; // 标题
    private String content;// 内容


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void info() {
        System.out.println("title:" + this.title);
        System.out.println("content:" + this.content);
    }
}
