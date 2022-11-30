//*  К калькулятору из предыдущего дз добавить логирование.


package homework_2;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;

public class task_4 {
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
        String res1 = String.valueOf(num1);
        String res2 = String.valueOf(op);
        String res3 = String.valueOf(num2);
        String res4 = String.valueOf(ans);
        String res = res1 + " " + res2 + " " + res3 + " = " + res4;
        myLog(res);
    }

    static void myLog(String res) {
        Logger logger = Logger.getLogger(task_4.class.getName());
        try {
                FileHandler fh = new FileHandler("homework_2/log_4.txt", true);
                logger.addHandler(fh);
                SimpleFormatter sFormat = new SimpleFormatter();
                fh.setFormatter(sFormat);
                logger.info(res);
                fh.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
