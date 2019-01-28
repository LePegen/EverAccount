/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import wrapped_model.WrappedAccountModel;
import model.*;
import view.*;

/**
 *
 * @author prg08p-a67-08
 */
public abstract class Controller {
    
    View currentView;
    WrappedAccountModel currentModel;
    
    //handlers
    
    //wrapped models
    
    public void initViews(){
        
    }
    
    public void initWrappedModels(){
        
    }
    
    /**
     *  includes setters for views handler
     */
    public void initHandlers(){
        
    }
    
    public void selectUser(){
        
    }
    
    public void updateView(View currentView){
        
    }
    
    /**
     * can also call the pushToDB(View) method in WrappedModel class
     */
    public void updateModel(){
        this.currentModel.pushToDB(this.currentView);
    }
    
}
