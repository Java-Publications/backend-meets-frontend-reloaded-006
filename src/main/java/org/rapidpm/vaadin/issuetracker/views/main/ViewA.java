package org.rapidpm.vaadin.issuetracker.views.main;

import org.rapidpm.vaadin.issuetracker.views.layout.LayoutWithMenuBar;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = ViewA.NAV_VIEW_A,layout = LayoutWithMenuBar.class)
public class ViewA extends Composite<Div> {
  public static final String NAV_VIEW_A = "ViewA";

  public ViewA() {
    getContent().add(new Span("View A"));
  }
}
