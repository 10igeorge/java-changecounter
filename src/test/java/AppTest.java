import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getChange_forNumberGreaterThan25_returnQuarters() {
    App change = new App();
    assertEquals("Your change for 50 cents is 2 quarters.", change.getChange(50));
  }


}
