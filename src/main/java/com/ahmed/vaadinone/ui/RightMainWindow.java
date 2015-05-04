/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.vaadinone.ui;

import com.vaadin.ui.VerticalSplitPanel;

/**
 *
 * @author Java-dev1
 */
public class RightMainWindow extends VerticalSplitPanel {

    private PersonList personList = new PersonList();
    private PersonForm personForm = new PersonForm();

    public RightMainWindow() {
        setFirstComponent(personList);
        setSecondComponent(personForm);
        setSplitPosition(40);
    }

}
