package org.rapidpm.vaadin.issuetracker.views.layout;

import static com.vaadin.flow.theme.lumo.Lumo.DARK;
import static java.util.Objects.requireNonNull;

import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Theme(value = Lumo.class, variant = DARK)
public class MainLayout
    extends Composite<VerticalLayout>
    implements RouterLayout, HasLogger {

  public static final String LAYOUT_CONTENT_ID = "main-layout-content";
  //Component to delegate content through.
  private Div content = new Div();

  public MainLayout() {
    content.setId(LAYOUT_CONTENT_ID);
    getContent().add(
        new Span("TOP"),
        content,
        new Span("Bottom"));
  }

  @Override
  public void showRouterLayoutContent(HasElement hasElement) {
    logger().info("showRouterLayoutContent - MainLayout");
    content.removeAll();
    if(hasElement != null){
      requireNonNull(hasElement.getElement());
      content.getElement().appendChild(hasElement.getElement());
    }
  }
}
