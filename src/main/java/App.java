import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {  }

  public static String getChange(Integer change) {
    Integer quarters = 0;
    while (change >= 25) {
      change -= 25;
      quarters++;
    }
    return String.format("Your change for 50 cents is %d quarters.", quarters);
  }

}
