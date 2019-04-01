package org.rapidpm.vaadin.issuetracker.views.main;

import static org.rapidpm.vaadin.issuetracker.views.main.ViewB.NAV_VIEW_B;

import org.rapidpm.vaadin.issuetracker.views.layout.LayoutWithMenuBar;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = NAV_VIEW_B, layout = LayoutWithMenuBar.class)
public class ViewB extends Composite<Div> {
  public static final String NAV_VIEW_B = "ViewB";

  public ViewB() {
    getContent().add(new Span("View B"));
  }
}
