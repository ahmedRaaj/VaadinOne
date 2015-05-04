/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.vaadinone.ui;

import com.vaadin.ui.Tree;

/**
 *
 * @author Java-dev1
 */
public class NavigationTree extends Tree {

    public static final Object SHOW_ALL = "Show all";
    public static final Object SEARCH = "Search";

    public NavigationTree() {
        addItem(SHOW_ALL);
        addItem(SEARCH);
    }

}
