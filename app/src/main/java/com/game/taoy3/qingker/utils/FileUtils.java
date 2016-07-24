package com.game.taoy3.qingker.utils;

import android.os.Environment;

import com.game.taoy3.qingker.BaseApp;

import java.io.File;

/**
 * Created by taoy3 on 16/4/6.
 */
public class FileUtils {
    private final static String BASEPATH = Environment.getExternalStorageState()
            + File.separator+ BaseApp.getInstance().getPackageName();
    public static File getFile(String fileName){
        return new File(BASEPATH+File.separator+fileName);
    }
}
