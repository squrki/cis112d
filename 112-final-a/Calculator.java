public class Calculator {
  private double result;

  public Calculator() {
    result = 0.0;
  }

  public void addition(double val) {
    result += val;
  }

  public void subtraction(double val) {
    result -= val;
  }

  public void multiplication(double val) {
    result *= val;
  }

  public void division(double val) {
    if (val != 0) {
      result /= val;
    } else {
      System.out.println("Error: Division by zero");
    }
  }

  public void clear() {
    result = 0.0;
  }

  public double getValue() {
    return result;
  }
}