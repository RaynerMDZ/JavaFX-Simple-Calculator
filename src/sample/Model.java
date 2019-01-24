package sample;

public class Model {

  public float calculate(long x, long y, String operator) {

    switch (operator) {

      case "+":
        return x + y;

      case "-":
        return x - y;

      case "*":
        return x * y;

      case "/":
        if (y == 0){
          return 0;
        }
        return x / (float) y;

      default:
        return 0;
    }
  }
}
