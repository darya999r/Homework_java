//Вывести все простые числа от 1 до 1000.

package homework_1;

public class task_2 {
    public static void main(String[] args) {

        int N = 1000;

        for (int i = 2 ; i < N ; i++) {
            if(checkSimple(i)) System.out.println(i);
        }
    }
    
    public static boolean checkSimple(int i) {
        if (i <= 1) return false;
        else if (i <= 3) return true;
        else if (i%2 == 0 || i%3 == 0) return false;
        int n = 5;
        while (n*n <= i) {
            if (i%n == 0 || i%(n+2) == 0) return false;
            n = n+6;
        }
        return true;
    }
}