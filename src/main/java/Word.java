import java.util.ArrayList;

public class Word {
  private String mTerm;
  private int mID;
  private static ArrayList<Word> instances = new ArrayList<Word>();



  public Word (String term) {
    mTerm = term;
    mID = instances.size();
    instances.add(this);

  }

  public String getTerm() {
    return mTerm;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public int getID() {
    return mID;
  }

}
