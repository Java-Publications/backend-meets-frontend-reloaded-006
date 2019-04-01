package org.rapidpm.vaadin.issuetracker.views.main;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;


public class MenuBar extends Composite<HorizontalLayout> {

  public static final String MENU_BAR_HOME = "menubar.home";
  public static final String MENU_BAR_VIEW_A = "menubar.view-a";
  public static final String MENU_BAR_VIEW_B = "menubar.view-b";

  public MenuBar() {
    getContent().add(new RouterLink(getTranslation(MENU_BAR_HOME) , MainView.class));
    getContent().add(new RouterLink(getTranslation(MENU_BAR_VIEW_A) , ViewA.class));
    getContent().add(new RouterLink(getTranslation(MENU_BAR_VIEW_B) , ViewB.class));
  }
}
