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
    while (change >= 25) {
      change -= 25;
      quarters++;
    }
    while (change >= 10){
      change -= 10;
      dimes ++;
    }
    return String.format("Your change for %d cents is %d quarters, %d dimes.", initialChange, quarters, dimes);
  }


}
