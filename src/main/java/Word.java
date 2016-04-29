import java.util.ArrayList;

public class Word {
  private String mTerm;
  private static ArrayList<Word> everyWord = new ArrayList<Word>();
  private int mID;



  public Word (String term) {
    mTerm = term;
    everyWord.add(this);
    mID = everyWord.size();
  }

  public String getTerm() {
    return mTerm;
  }

  public static ArrayList<Word> all() {
    return everyWord;
  }

  public static void clear() {
    everyWord.clear();
  }

  public int getID() {
    return mID;
  }

  public static Word find(int id) {
  try {
    return everyWord.get(id - 1);
  } catch (IndexOutOfBoundsException exception) {
    return null;
  }
 }

}
