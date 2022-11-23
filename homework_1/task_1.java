//Вычислить n-ое треугольное число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n).

package homework_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner (System.in);
		System.out.printf("Enter number n: ");
		int n = iScanner.nextInt();
        iScanner.close();

        int[] arr1 = new int [n];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ((i+1)*(i+2))/2;
            sum += arr1[i];
        }
        System.out.printf("n-th triangular number = %d", sum);
        System.out.println();

        int[] arr2 = new int [n];
        int pow = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            pow *= arr2[i];
        }
        System.out.printf("n-th factorial = %d", pow);
    }
}