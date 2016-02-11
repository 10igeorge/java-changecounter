import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getChange_forNumberGreaterThan25_returnQuarters() {
    App change = new App();
    assertEquals("Your change for 50 cents is 2 quarters, 0 dimes.", change.getChange(50));
  }

  @Test
  public void getChange_forNumberGreaterThan10_returnsDimes(){
    App change = new App();
    assertEquals("Your change for 20 cents is 0 quarters, 2 dimes.", change.getChange(20));
  }

}
