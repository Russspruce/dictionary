import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

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
    Word secondWord = new Word("Locate");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void word_getIDofWord_1(){
    Word myWord = new Word("Frindle");
    assertEquals(1, myWord.getID());
  }

  @Test
  public void find_determineIfWordisSameID_secondWord() {
    Word firstWord = new Word("Frindle");
    Word secondWord = new Word("Rummage");
    assertEquals(Word.find(secondWord.getID()), secondWord);
  }

  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
}
}
