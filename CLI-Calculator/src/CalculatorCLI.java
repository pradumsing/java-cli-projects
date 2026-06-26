import java.util.Scanner;
public class    CalculatorCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operation (+,-,*,/): ");
        char operation = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result =num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Error");
                    return;
                }
                result = num1 / num2;
                break;


            default:
                System.out.println("Syntax Error");
                return;
        }
        System.out.println("Result: " + result);
    }
}
