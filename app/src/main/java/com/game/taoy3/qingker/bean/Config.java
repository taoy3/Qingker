package com.game.taoy3.qingker.bean;

/**
 * Created by taoy3 on 16/4/6.
 */
public class Config {
    /**
     * status : 0
     * msg : null
     * data : {"e":1,"ss":0,"st":{"b":30,"p":60},"lbs":0,"sp":{"w":"wx38a1d9f952e2343f"}}
     */

    private int status;
    private Object msg;
    /**
     * e : 1
     * ss : 0
     * st : {"b":30,"p":60}
     * lbs : 0
     * sp : {"w":"wx38a1d9f952e2343f"}
     */

    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int e;
        private int ss;
        /**
         * b : 30
         * p : 60
         */

        private StBean st;
        private int lbs;
        /**
         * w : wx38a1d9f952e2343f
         */

        private SpBean sp;

        public int getE() {
            return e;
        }

        public void setE(int e) {
            this.e = e;
        }

        public int getSs() {
            return ss;
        }

        public void setSs(int ss) {
            this.ss = ss;
        }

        public StBean getSt() {
            return st;
        }

        public void setSt(StBean st) {
            this.st = st;
        }

        public int getLbs() {
            return lbs;
        }

        public void setLbs(int lbs) {
            this.lbs = lbs;
        }

        public SpBean getSp() {
            return sp;
        }

        public void setSp(SpBean sp) {
            this.sp = sp;
        }

        public static class StBean {
            private int b;
            private int p;

            public int getB() {
                return b;
            }

            public void setB(int b) {
                this.b = b;
            }

            public int getP() {
                return p;
            }

            public void setP(int p) {
                this.p = p;
            }
        }

        public static class SpBean {
            private String w;

            public String getW() {
                return w;
            }

            public void setW(String w) {
                this.w = w;
            }
        }
    }
}
