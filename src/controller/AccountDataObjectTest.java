package controller;

import view.*;

/**
 *
 * @author Gene Garcia
 */
public class AccountDataObjectTest {

    public AccountDataObjectTest() {
    
    
    }
    
    
    public void test(){
        
    }
    
    public boolean assertValues(String val1,String val2){
    if(val1==val2){
    return true;
            }
    return false;
    }
    public static void main(String[] args) {
        new AccountOverviewView().setVisible(true);
        new AccountView().setVisible(true);
        new LoginView().setVisible(true);
    }
    
}
