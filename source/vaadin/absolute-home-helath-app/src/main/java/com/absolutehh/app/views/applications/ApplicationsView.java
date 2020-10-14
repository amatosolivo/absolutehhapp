package com.absolutehh.app.views.applications;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.absolutehh.app.views.main.MainView;

@Route(value = "applications", layout = MainView.class)
@PageTitle("Applications")
@CssImport("./styles/views/applications/applications-view.css")
public class ApplicationsView extends Div {

    public ApplicationsView() {
        setId("applications-view");
        add(new Label("Content placeholder"));
    }

}
