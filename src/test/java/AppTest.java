import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void wordIsSubmittedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Submit New Word"));
    fill("#word").with("frindle");
    submit(".btn");
    assertThat(pageSource()).contains("word has been accepted");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("Frindle");
    submit(".btn");
    click("a", withText("Review Words"));
    assertThat(pageSource()).contains("Frindle");
  }

  @Test
    public void wordDefinitionFormIsDisplayed() {
      goTo("http://localhost:4567/words/new");
      fill("#word").with("Frindle");
      submit(".btn");
      click("a", withText("Review Words"));
      goTo("http://localhost:4567/words/1");
      click("a", withText("Add a New Definition"));
      assertThat(pageSource()).contains("Add a definition to Frindle");
    }
}
