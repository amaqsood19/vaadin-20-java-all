package com.luxoft.mx.tool.ui.views.map;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.luxoft.mx.tool.ui.components.leafletmap.LeafletMap;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.luxoft.mx.tool.ui.views.MainLayout;

@PageTitle("Map")
@Route(value = "map", layout = MainLayout.class)
public class MapView extends VerticalLayout {

    private LeafletMap map = new LeafletMap();

    public MapView() {
        setSizeFull();
        setPadding(false);
        map.setSizeFull();
        map.setView(55.0, 10.0, 4);
        add(map);
    }
}
