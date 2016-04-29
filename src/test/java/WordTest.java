import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("Frindle");
    assertEquals(true, myWord instanceof Word);
  }
}
