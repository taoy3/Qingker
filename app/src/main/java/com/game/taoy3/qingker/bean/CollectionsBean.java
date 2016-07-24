package com.game.taoy3.qingker.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by taoy3 on 16/4/6.
 */
public  class CollectionsBean implements Serializable{
    private int id;
    private String short_desc;
    private String type;
    private int layout;
    private String bg_video;
    private String title;
    private String sub_title;
    private int bg_color;
    private String url;
    private boolean title_notshown;
    private List<String> bg_pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public String getBg_video() {
        return bg_video;
    }

    public void setBg_video(String bg_video) {
        this.bg_video = bg_video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public int getBg_color() {
        return bg_color;
    }

    public void setBg_color(int bg_color) {
        this.bg_color = bg_color;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isTitle_notshown() {
        return title_notshown;
    }

    public void setTitle_notshown(boolean title_notshown) {
        this.title_notshown = title_notshown;
    }

    public List<String> getBg_pic() {
        return bg_pic;
    }

    public void setBg_pic(List<String> bg_pic) {
        this.bg_pic = bg_pic;
    }
}
