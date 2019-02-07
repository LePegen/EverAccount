/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cryptolib.lib.CryptoTools;
import cryptolib.lib.strategy.MDCryptoState.MDFactory.MDKeyFactory;
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
    
    public String decryptString(byte[] target,byte[] key){
        MDKeyFactory keyFactory=new MDKeyFactory();
        byte[] decrypted=tools.decrypt(target, keyFactory.createKey(key));
        String decryptedString=new String(decrypted,StandardCharsets.UTF_8);
        return decryptedString;
    }
    
    public String encryptString(byte[] target, byte[] key) {
        MDKeyFactory keyFactory = new MDKeyFactory();
        byte[] encrypted = tools.encrypt(target, keyFactory.createKey(key));
        String encryptedString = new String(encrypted, StandardCharsets.UTF_8);
        return encryptedString;
    }
    
    public byte[] getUserKey() {
        return userKey;
    }

    public void setUserKey(byte[] userKey) {
        this.userKey = userKey;
    }

}
