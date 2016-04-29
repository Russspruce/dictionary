import java.util.ArrayList;

public class Definition {
  private String mSummary;
  private static ArrayList<Definition> glossary = new ArrayList<Definition>();
  private int mID;

  public Definition(String summary){
    mSummary = summary;
    glossary.add(this);
    mID = glossary.size();
  }

  public String getSummary() {
    return mSummary;
  }

  public static ArrayList<Definition> all(){
    return glossary;
  }

  public int getID(){
    return mID;
  }

  public static void clear() {
    glossary.clear();
  }


  public static Definition find(int id) {
    try{
      return glossary.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
 }
}
