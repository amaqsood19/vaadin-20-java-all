package com.luxoft.mx.tool.ui.views.empty;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.luxoft.mx.tool.ui.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Empty")
@Route(value = "empty", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class EmptyView extends Div {

    public EmptyView() {
        addClassName("empty-view");
        add(new Text("Content placeholder"));
    }

}
