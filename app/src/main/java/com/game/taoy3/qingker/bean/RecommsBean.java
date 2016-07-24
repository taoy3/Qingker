package com.game.taoy3.qingker.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by taoy3 on 16/4/9.
 */
public class RecommsBean implements Serializable{
    private Referrer referrer;
    private Owner owner;
    private String[] bg_pic;
    private String title;
    private String sub_title;
    private String short_desc;
    private int like_count;
    private String destination;
    private List<CollectionsBean> collections;
    private String type;
    private String address;
    private int bg_color;

    public int getBg_color() {
        return bg_color;
    }

    public void setBg_color(int bg_color) {
        this.bg_color = bg_color;
    }

    public String getAddress() {
        return address;
    }

    public Referrer getReferrer() {
        return referrer;
    }

    public void setReferrer(Referrer referrer) {
        this.referrer = referrer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CollectionsBean> getCollections() {
        return collections;
    }

    public void setCollections(List<CollectionsBean> collections) {
        this.collections = collections;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String[] getBg_pic() {
        return bg_pic;
    }

    public void setBg_pic(String[] bg_pic) {
        this.bg_pic = bg_pic;
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

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
