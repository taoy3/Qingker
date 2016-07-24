package com.game.taoy3.qingker.constant;

/**
 * Created by taoy3 on 16/4/6.
 */
public class UrlConstant {
    //POST
    public static final String APPLOG = "http://alog.umeng.com/app_logs/app_logs";

    //GET 精选界面
    public static final String getSelected(int page){
        return  "http://appsrv.flyxer.com/api/digest/main?v=2&page="+page+"&qid=3426";
    }
    //GET
    public static final String VERSION = "http://appsrv.flyxer.com/api/app/version?os=android";

    //POST
    public static final String CONFIG = "http://stats.magicwindow.cn/config/v2";


    //POST
    public static final String BINARY = "http://apilocate.amap.com/mobile/binary";

    //POST
    public static final String MAGICTS = "http://stats.magicwindow.cn/ts";

    //POST
    public static final String MAGICCONFIG = "http://stats.magicwindow.cn/config/v2";

    //POST
    public static final String INIT = "http://apiinit.amap.com/v3/log/init";

    //POST
    public static final String REG = "http://appsrv.flyxer.com/api/usr/regs";

    //GET 发现界面
    public static final String DISCOVERY = "http://appsrv.flyxer.com/api/digest/discovery";

    //GET 目的地界面
    public static final String getRecommdests(int page){
        return  "http://appsrv.flyxer.com/api/digest/recomm/dests?page="+page;
    }

    //GET
    public static final String DT = "http://223.202.108.11/api/v1/cns/ck?dt=ca8caeab790a8729&v=5";
}
