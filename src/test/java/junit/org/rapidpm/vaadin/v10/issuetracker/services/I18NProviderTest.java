package junit.org.rapidpm.vaadin.issuetracker.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.rapidpm.vaadin.issuetracker.services.I18NProviderImpl;
import com.vaadin.flow.i18n.I18NProvider;

public class I18NProviderTest {


  @Test
  void test000() {
    assertEquals(Locale.GERMAN , Locale.GERMAN);
  }

  @Test
  void test001() {
    final I18NProvider i18NProvider = new I18NProviderImpl();

    final List<Locale> providedLocales = i18NProvider.getProvidedLocales();
    assertEquals(2 , providedLocales.size());
    //assume that there is a key : provider.test=german/english/default
    assertEquals("english" ,
                 i18NProvider.getTranslation("provider.test" , Locale.ENGLISH , null));
  }
}
