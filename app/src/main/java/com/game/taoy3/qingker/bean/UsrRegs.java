package com.game.taoy3.qingker.bean;

import java.util.List;

/**
 * Created by taoy3 on 16/4/6.
 */
public class UsrRegs {

    /**
     * did : 52525
     * magic_window : true
     * splash : {"id":4,"pics":["http://data.qinker.com/image/original/da/d9/2b/dad92b0cc81c1efa12aaf43cd08b0d26.png","http://data.qinker.com/image/original/e4/2c/e2/e42ce29ab78b36176a3b8a8ca8eac7a8.png","http://data.qinker.com/image/original/02/0c/e3/020ce3e550400c4128a38ec84487bfe0.png"]}
     * place : {"id":6664,"country":"中国","province":"广东省","city":"深圳市"}
     */

    private int did;
    private boolean magic_window;
    /**
     * id : 4
     * pics : ["http://data.qinker.com/image/original/da/d9/2b/dad92b0cc81c1efa12aaf43cd08b0d26.png","http://data.qinker.com/image/original/e4/2c/e2/e42ce29ab78b36176a3b8a8ca8eac7a8.png","http://data.qinker.com/image/original/02/0c/e3/020ce3e550400c4128a38ec84487bfe0.png"]
     */

    private SplashBean splash;
    /**
     * id : 6664
     * country : 中国
     * province : 广东省
     * city : 深圳市
     */

    private PlaceBean place;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public boolean isMagic_window() {
        return magic_window;
    }

    public void setMagic_window(boolean magic_window) {
        this.magic_window = magic_window;
    }

    public SplashBean getSplash() {
        return splash;
    }

    public void setSplash(SplashBean splash) {
        this.splash = splash;
    }

    public PlaceBean getPlace() {
        return place;
    }

    public void setPlace(PlaceBean place) {
        this.place = place;
    }

    public static class SplashBean {
        private int id;
        private List<String> pics;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getPics() {
            return pics;
        }

        public void setPics(List<String> pics) {
            this.pics = pics;
        }
    }

    public static class PlaceBean {
        private int id;
        private String country;
        private String province;
        private String city;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
