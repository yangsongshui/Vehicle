package com.example.administrator.vehicle.bean;

import com.example.administrator.vehicle.R;

public class ItemArticle {

    private  int[] mData ;
    private String title;
    private String name;
    private String comments;
    private String like;
    private int  collect;

    public ItemArticle() {
    }

    public ItemArticle(int[] mData, String title, String name, String comments, String like, int collect) {
        this.mData = mData;
        this.title = title;
        this.name = name;
        this.comments = comments;
        this.like = like;
        this.collect = collect;
    }

    public int[] getmData() {
        return mData;
    }

    public void setmData(int[] mData) {
        this.mData = mData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }
}
