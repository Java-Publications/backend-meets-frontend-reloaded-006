package org.rapidpm.vaadin.issuetracker.views.layout;

import static java.util.Objects.requireNonNull;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.issuetracker.views.main.MenuBar;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;

@ParentLayout(value = MainLayout.class)
public class LayoutWithMenuBar
    extends Composite<VerticalLayout>
    implements RouterLayout , HasLogger {

  public static final String LAYOUT_CONTENT_ID = "layout-content";
  public static final String LAYOUT_MENUBAR_ID = "layout-menubar";

  private final MenuBar menuBar = new MenuBar();
  private final Div content = new Div();

  public LayoutWithMenuBar() {
    menuBar.setId(LAYOUT_MENUBAR_ID);
    content.setId(LAYOUT_CONTENT_ID);
    getContent().add(menuBar, content);
  }

  @Override
  public void showRouterLayoutContent(HasElement hasElement) {
    logger().info("showRouterLayoutContent - LayoutWithMenuBar");
    content.removeAll();
    if (hasElement != null) {
      requireNonNull(hasElement.getElement());
      content.getElement().appendChild(hasElement.getElement());
    }
  }
}
