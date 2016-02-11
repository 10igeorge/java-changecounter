import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {  }

  public static String getChange(Integer change) {
    Integer initialChange = change;
    Integer quarters = 0;
    String quarterText = "";
    Integer dimes = 0;
    String dimeText = "";
    Integer nickels = 0;
    String nickelText = "";
    Integer pennies = 0;
//Quarter Test
    while (change >= 25) {
      change -= 25;
      quarters++;
    }
    if (quarters == 0){
      quarterText = "";
    } else if (quarters == 1) {
      quarterText = "1 quarter, ";
    } else {
      quarterText = quarters.toString() + " quarters, ";
    }
//Dimes Test
    while (change >= 10){
      change -= 10;
      dimes ++;
    }
    if (dimes == 0){
      dimeText = "";
    } else if (dimes == 1) {
      dimeText = "1 dime, ";
    } else {
      dimeText = dimes.toString() + " dimes, ";
    }
//Nickels Test
    while (change >= 5){
      change -= 5;
      nickels ++;
    }
    if (nickels == 0){
      nickelText = "";
    } else if (nickels == 1) {
      nickelText = "1 nickel, ";
    } else {
      nickelText = nickels.toString() + " nickels, ";
    }
    while (change >= 1){
      change -= 1;
      pennies ++;
    }
    return String.format("Your change for %d cents is %s%s%s%d pennies.", initialChange, quarterText, dimeText, nickelText, pennies);
  }
}
