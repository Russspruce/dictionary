import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void define_definitionIsPresent_true() {
    Definition myDefinition = new Definition("A pen.");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void define_definitionIsStored_string() {
    Definition myDefinition = new Definition("A pen.");
    assertEquals("A pen.", myDefinition.getSummary());
  }

  @Test
  public void define_checkToSeeAllSummariesStored() {
    Definition firstDefiniton = new Definition("A pen.");
    Definition secondDefinition = new Definition("Writing utensil.");
    assertTrue(Definition.all().contains(firstDefiniton));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
 public void clear_emptiesAllDefinitionsFromArrayList_0() {
   Definition myDefinition = new Definition("A pen.");
   Definition.clear();
   assertEquals(Definition.all().size(), 0);
 }

 @Test
 public void getID_definitionWithAnID_1() {
   Definition myDefinition = new Definition("A pen.");
   assertEquals(1, myDefinition.getID());
 }

 @Test
 public void find_returnDefinitionWithSameID_second() {
   Definition firstDefiniton = new Definition("A pen.");
   Definition secondDefinition = new Definition("Writing utensil.");
   assertEquals(Definition.find(secondDefinition.getID()), secondDefinition);
 }

 @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }
}
