import java.util.ArrayList;

public class Definition {
  private String mWordDefinition;
  private static ArrayList<Definition> glossary = new ArrayList<Definition>();
  private int mId;

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    glossary.add(this);
    mId = glossary.size();
  }

  public String getDefinition() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return glossary;
  }

  public static void clear() {
    glossary.clear();
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return glossary.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
