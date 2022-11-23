// +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package homework_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int el1;
        int el2;
        int res;
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter first element number 1 (from 1 to 9): ");
        el1 = iScanner.nextInt();
        System.out.printf("Enter second element number 2 (from 1 to 9): ");
        el2 = iScanner.nextInt();
        System.out.printf("Enter result of sum numbers: ");
        res = iScanner.nextInt();
        iScanner.close();

        try {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int num1 = el1*10 + i;
                    int num2 = j*10 + el2;
                    if (num1 + num2 == res) {
                        System.out.printf(num1 + " + " + num2 + " = " + res);
                    }
                    throw new Exception("Calculation error.");
                }
            }
        } 
        catch(Exception e) {
            System.out.println("Values not found!");
        }   
    }  
}
