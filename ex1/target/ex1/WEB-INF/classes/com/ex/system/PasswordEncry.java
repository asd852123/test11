package com.ex.system;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/10 23:46
 **/
public class PasswordEncry {

    private static final String SALT = "hello";


    //指定散列算法为md5
    private static String algorithmName = "MD5";
    //散列迭代次数
    private static final int hashIterations = 2;


    public static String encrypt(String password) {

        String newPassword =
                new SimpleHash(algorithmName,password,
                        ByteSource.Util.bytes(SALT),
                        hashIterations).toHex();


        return newPassword;


    }
}
