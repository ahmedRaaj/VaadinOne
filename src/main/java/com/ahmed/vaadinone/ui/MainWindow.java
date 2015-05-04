/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ahmed.vaadinone.ui;

import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;

/**
 *
 * @author Java-dev1
 */
public class MainWindow extends HorizontalSplitPanel {
        private NavigationTree nTree = null;
        private RightMainWindow rWindow = new RightMainWindow();

    
    public MainWindow(){
        setSplitPosition(200, Unit.PIXELS);
        setFirstComponent(getnTree());
        setSecondComponent(rWindow);
        setSizeFull();
    }
    
     public NavigationTree getnTree() {
        if(nTree == null){
            nTree = new NavigationTree();
        }
        return nTree;
    }
}
