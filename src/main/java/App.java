import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {  }

  public static String getChange(Integer change) {
    Integer initialChange = change;
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nickels = 0;
    Integer pennies = 0;
    while (change >= 25) {
      change -= 25;
      quarters++;
    }
    while (change >= 10){
      change -= 10;
      dimes ++;
    }
    while (change >= 5){
      change -= 5;
      nickels ++;
    }
    while (change >= 1){
      change -= 1;
      pennies ++;
    }
    return String.format("Your change for %d cents is %d quarters, %d dimes, %d nickels, %d pennies.", initialChange, quarters, dimes, nickels, pennies);
  }


}
