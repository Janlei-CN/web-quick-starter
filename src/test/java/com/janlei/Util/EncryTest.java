package com.janlei.Util;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

/**
 * 配置项加密测试类
 */
public class EncryTest {

    @Test
    public void encryptPwd() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("janlei");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("123456");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

}