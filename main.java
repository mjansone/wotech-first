// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suit, rain coat
    String season = "qwerty";
    

    if (season == ("winter")) {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == ("spring")) {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == ("summer")) {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == ("autumn")) {
      System.out.println("Wear a rain coat!");
    }
    else{
      System.out.println("I do not recognize this season");
    }

    var temperature = -10.5;

      if (temperature <= 5){
      System.out.println("Wear a super warm jacket!");
      }
      else if (temperature <= 15){
        System.out.println("You need to wear warm!");
      }
      else if (temperature <= 30){
        System.out.println("You need to wear normal clothing!");
      }
      else {
        System.out.println("You need cooling!");
      }
  }
    
  }

