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
}
