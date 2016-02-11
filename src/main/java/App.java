import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/change", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/change.vtl");

      String userChange = request.queryParams("userChange");
      Integer integerUserChange = Integer.parseInt(userChange);
      String change = getChange(integerUserChange);

      model.put("change", change);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String getChange(Integer change) {
    Integer initialChange = change;
    Integer quarters = 0;
    String quarterText = "";
    Integer dimes = 0;
    String dimeText = "";
    Integer nickels = 0;
    String nickelText = "";
    Integer pennies = 0;
    String pennyText = "";
    if (change <= 0){
      return "Please enter a positive value";
    }
//Quarter Test
    while (change >= 25) {
      change -= 25;
      quarters++;
    }
    if (quarters == 0){
      quarterText = "";
    } else if (quarters == 1 && change == 0) {
      quarterText = "1 quarter.";
    } else if (quarters == 1 && change != 0){
      quarterText = "1 quarter, ";
    } else if (quarters > 1 && change == 0) {
      quarterText = quarters.toString() + " quarters.";
    } else if (quarters > 1 && change != 0){
      quarterText = quarters.toString() + " quarters, ";
    }
//Dimes Test
    while (change >= 10){
      change -= 10;
      dimes ++;
    }
    if (dimes == 0){
      dimeText = "";
    } else if (dimes == 1 && change == 0) {
      dimeText = "1 dime.";
    } else if (dimes == 1 && change != 0){
      dimeText = "1 dime, ";
    } else if (dimes > 1 && change == 0) {
      dimeText = dimes.toString() + " dimes.";
    } else if (dimes > 1 && change != 0){
      dimeText = dimes.toString() + " dimes, ";
    }
//Nickels Test
    while (change >= 5){
      change -= 5;
      nickels ++;
    }
    if (nickels == 0){
      nickelText = "";
    } else if (nickels == 1 && change == 0) {
      nickelText = "1 nickel.";
    } else if (nickels == 1 && change != 0){
      nickelText = "1 nickel, ";
    } else if (nickels > 1 && change == 0) {
      nickelText = nickels.toString() + " nickels.";
    } else if (nickels > 1 && change != 0){
      nickelText = nickels.toString() + " nickels, ";
    }
//Pennies Test
    while (change >= 1){
      change -= 1;
      pennies ++;
    }
    if (pennies == 0){
      pennyText = "";
    } else if (pennies == 1 && change == 0) {
      pennyText = "1 penny.";
    } else if (pennies == 1 && change != 0){
      pennyText = "1 penny, ";
    } else if (pennies > 1 && change == 0) {
      pennyText = pennies.toString() + " pennies.";
    } else if (pennies > 1 && change != 0){
      pennyText = pennies.toString() + " pennies, ";
    }
    return String.format("Your change for %d cents is %s%s%s%s", initialChange, quarterText, dimeText, nickelText, pennyText);
  }
}
