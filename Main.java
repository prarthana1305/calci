import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();

        int result = calculator.evaluate(expression);
        System.out.println("Result: " + result);

        scanner.close();

    }
}
