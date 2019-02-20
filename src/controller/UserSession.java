/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cryptolib.lib.CryptoKey;
import cryptolib.lib.CryptoTools;
import cryptolib.lib.strategy.MDCryptoState.MDFactory.MDKeyFactory;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author lipat
 */
public class UserSession {

    byte[] userKey;
    CryptoTools tools;

    public UserSession() {
        tools = new CryptoTools();
        tools.setEncryptState("MDDecyption");
    }

    public CryptoTools getTools() {
        return tools;
    }
    MDKeyFactory keyFactory=new MDKeyFactory();
    public String decryptString(String data, String key){
        cryptolib.lib.CryptoKey newKey = keyFactory.createKey(key.getBytes(StandardCharsets.UTF_8));
        byte[] convBytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(tools.decrypt(convBytes, newKey), Charset.forName("UTF8"));
    }
    
    public String encryptString(String data, CryptoKey key) {
        byte[] convBytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(tools.encrypt(convBytes, key), Charset.forName("UTF8"));
    }
    
    public byte[] getUserKey() {
        return userKey;
    }

    public void setUserKey(byte[] userKey) {
        this.userKey = userKey;
    }

}
