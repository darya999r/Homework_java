// Реализовать простой калькулятор.

package homework_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        num1 = iScanner.nextDouble();
        System.out.printf("Enter an operator (+, -, *, /): ");
        op = iScanner.next().charAt(0);
        System.out.printf("Enter second number: ");
        num2 = iScanner.nextDouble();
        iScanner.close();

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.printf("\nResult:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = %.3f\n", ans);
    }
}