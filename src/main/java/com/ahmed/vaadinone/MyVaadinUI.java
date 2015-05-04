package com.ahmed.vaadinone;

import com.ahmed.vaadinone.ui.MainWindow;
import com.ahmed.vaadinone.ui.NavigationTree;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {

    private Button newContact = new Button("Add contact");
    private Button search = new Button("Search");
    private Button share = new Button("Share");
    private Button help = new Button("Help");

    private MainWindow mainWindow = null;

    @Override
    protected void init(VaadinRequest request) {
        buildMainLayout();
    }

    private void buildMainLayout() {
        VerticalLayout vLayout = new VerticalLayout();
        getMainWindow();

        vLayout.addComponent(createToolbar()); //creating the upper toolbar.
        vLayout.addComponent(mainWindow);
        vLayout.setExpandRatio(mainWindow, 1);
        vLayout.setSizeFull();
        setContent(vLayout);

    }

    private Component createToolbar() {
        HorizontalLayout hl = new HorizontalLayout();
        hl.addComponent(newContact);
        hl.addComponent(search);
        hl.addComponent(share);
        hl.addComponent(help);
        return hl;

    }

    public MainWindow getMainWindow() {
        if (mainWindow == null) {
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }

}
