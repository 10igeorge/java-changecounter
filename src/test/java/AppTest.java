import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getChange_forNumberGreaterThan25_returnQuarters() {
    App change = new App();
    assertEquals("Your change for 50 cents is 2 quarters.", change.getChange(50));
  }

  @Test
  public void getChange_forNumberGreaterThan10_returnsDimes(){
    App change = new App();
    assertEquals("Your change for 20 cents is 2 dimes.", change.getChange(20));
  }

  @Test
  public void getChange_forNumberGreaterThan5_returnsNickels(){
    App change = new App();
    assertEquals("Your change for 5 cents is 1 nickel.", change.getChange(5));
  }

  @Test
  public void getChange_forNumberGreaterThan1_returnPennies(){
    App change = new App();
    assertEquals("Your change for 2 cents is 2 pennies.", change.getChange(2));
  }
  @Test
  public void getChange_forNegativeNumber_returnError(){
    App change = new App();
    assertEquals("Please enter a positive value", change.getChange(-2));
  }
}
