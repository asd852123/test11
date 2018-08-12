package com.ex.system;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/10 23:09
 **/
public class HexMD5 {

    private static final String SALT = "hello";
    private static HexMD5 hex;

    public HexMD5() {

    }

    public static HexMD5 getIns() {
        return hex;
    }

    public static String md5Pwd(String password) {
        // TODO Auto-generated method stub
        String md5Pwd = new Md5Hash(password, SALT).toHex();
        return md5Pwd;
    }
}
