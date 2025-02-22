import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    System.out.println("Please enter your command and parameters: ");
    String input = "";
    while (!input.equals("exit")) {
      input = scanner.nextLine();
      String[] split = input.split(" ");
      switch(split[0]) {
        case "add":
          System.out.println(calculator.add(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
          break;
        case "subtract":
          System.out.println(calculator.subtract(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
          break;
        case "multiply":
          System.out.println(calculator.multiply(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
          break;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(split[1])));
          break;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(split[1])));
          break;
      }
    }
    scanner.close();
  }
}
