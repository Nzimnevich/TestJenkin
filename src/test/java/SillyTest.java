import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SillyTest {
  @Test
  public void test(){
    open("https://ru.selenide.org/quick-start.html");
  }
}
