package com.absolutehh.app.views.logout;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.absolutehh.app.views.main.MainView;

@Route(value = "logout", layout = MainView.class)
@PageTitle("Log Out")
@CssImport("./styles/views/logout/log-out-view.css")
public class LogOutView extends Div {

    public LogOutView() {
        setId("log-out-view");
        add(new Label("Content placeholder"));
    }

}
