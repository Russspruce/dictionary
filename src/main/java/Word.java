import java.util.ArrayList;

public class Word {
  private String mTerm;
  private static ArrayList<Word> everyWords = new ArrayList<Word>();
  private int mId;
  private ArrayList<Definition> mDefinitions;

  public Word (String term) {
    mTerm = term;
    everyWords.add(this);
    mId = everyWords.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getTerm() {
    return mTerm;
  }

  public static ArrayList<Word> all() {
    return everyWords;
  }

  public static void clear() {
    everyWords.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try {
      return everyWords.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition def) {
    mDefinitions.add(def);
  }
}
