package com.game.taoy3.qingker.bean;

import java.io.Serializable;

/**
 * Created by taoy3 on 16/4/9.
 */
public class Owner implements Serializable{

    /**
     * id : ​1191
     * username : 出国去
     * photo_url : http://data.qinker.com/image/avatar/51/0f/5e/510f5e6f777c68e0345e6f88e4735c09.png
     * bg_pic :
     * intro : 这家伙还没有写自我介绍呢。
     * fr_num : ​0
     * fg_num : ​0
     * prd_num : ​89
     * album_count : ​91
     * msg_num : ​0
     * is_followed : ​0
     * like_num : ​0
     * type : ​1
     */

    private String id;
    private String username;
    private String photo_url;
    private String bg_pic;
    private String intro;
    private String fr_num;
    private String fg_num;
    private String prd_num;
    private String album_count;
    private String msg_num;
    private String is_followed;
    private String like_num;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getBg_pic() {
        return bg_pic;
    }

    public void setBg_pic(String bg_pic) {
        this.bg_pic = bg_pic;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getFr_num() {
        return fr_num;
    }

    public void setFr_num(String fr_num) {
        this.fr_num = fr_num;
    }

    public String getFg_num() {
        return fg_num;
    }

    public void setFg_num(String fg_num) {
        this.fg_num = fg_num;
    }

    public String getPrd_num() {
        return prd_num;
    }

    public void setPrd_num(String prd_num) {
        this.prd_num = prd_num;
    }

    public String getAlbum_count() {
        return album_count;
    }

    public void setAlbum_count(String album_count) {
        this.album_count = album_count;
    }

    public String getMsg_num() {
        return msg_num;
    }

    public void setMsg_num(String msg_num) {
        this.msg_num = msg_num;
    }

    public String getIs_followed() {
        return is_followed;
    }

    public void setIs_followed(String is_followed) {
        this.is_followed = is_followed;
    }

    public String getLike_num() {
        return like_num;
    }

    public void setLike_num(String like_num) {
        this.like_num = like_num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
