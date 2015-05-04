/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.vaadinone.ui;

import com.vaadin.ui.Table;

/**
 *
 * @author Java-dev1
 */
public class PersonList extends Table {

    public PersonList() {
// create some dummy data
        addContainerProperty("First Name", String.class, "Mark");
        addContainerProperty("Last Name", String.class, "Smith");
        addItem();
        addItem();
        setSizeFull();
    }
}
