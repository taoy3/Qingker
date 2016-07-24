package com.game.taoy3.qingker.bean;

/**
 * Created by taoy3 on 16/4/6.
 */
public class RecommDest {

    /**
     * id : 6443
     * name : 加拿大
     * bg_pic : http://data.qinker.com/image/original/67/09/d2/6709d2d2486ecb1207afea4fae39b9a1.jpg
     * bg_color : 6771777
     * type : C
     * desc : 加拿大有着难以计数的奇观美景，枫叶般艳红的秋天，多姿多彩的地形地貌，巍峨的高山…构成了加拿大神奇、独特而别具魅力的自然风光。
     */

    private int id;
    private String name;
    private String bg_pic;
    private int bg_color;
    private String type;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBg_pic() {
        return bg_pic;
    }

    public void setBg_pic(String bg_pic) {
        this.bg_pic = bg_pic;
    }

    public int getBg_color() {
        return bg_color;
    }

    public void setBg_color(int bg_color) {
        this.bg_color = bg_color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
