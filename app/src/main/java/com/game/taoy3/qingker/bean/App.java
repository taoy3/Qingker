package com.game.taoy3.qingker.bean;

/**
 * Created by taoy3 on 16/4/6.
 */
public class App {

    /**
     * major : 1
     * minor : 2
     * patch : 0
     */

    private VersionBean version;
    /**
     * version : {"major":"1","minor":"2","patch":"0"}
     * url : http://a.app.qq.com/o/simple.jsp?pkgname=com.qinker.qinker
     * note : v1.2.0
     */

    private String url;
    private String note;

    public VersionBean getVersion() {
        return version;
    }

    public void setVersion(VersionBean version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static class VersionBean {
        private String major;
        private String minor;
        private String patch;

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getMinor() {
            return minor;
        }

        public void setMinor(String minor) {
            this.minor = minor;
        }

        public String getPatch() {
            return patch;
        }

        public void setPatch(String patch) {
            this.patch = patch;
        }
    }
}
