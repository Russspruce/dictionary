import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word myWord = new Word("Frindle");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void word_seeIfWordIsRead_Frindle() {
    Word myWord = new Word("Frindle");
    assertEquals("Frindle", myWord.getTerm());
  }

  @Test
  public void all_returnAllOfTheWords_true() {
    Word firstWord = new Word("Frindle");
    Word secondWord = new Word("Finster");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }
}
