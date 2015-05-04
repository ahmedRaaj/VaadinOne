/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.vaadinone.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

/**
 *
 * @author Java-dev1
 */
public class PersonForm extends Form {

    private Button save = new Button("Save");
    private Button cancel = new Button("Cancel");

    public PersonForm() {
        addField("First Name", new TextField("First Name"));
        addField("Last Name", new TextField("Last Name"));
        HorizontalLayout footer = new HorizontalLayout();
        footer.setSpacing(true);
        footer.addComponent(save);
        footer.addComponent(cancel);
        setFooter(footer);
    }
}
