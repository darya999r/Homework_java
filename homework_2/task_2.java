// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package homework_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;
import java.util.logging.FileHandler;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 18, 3, 1, 81, 55, 16};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
 
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    myLog(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void myLog(String res) {
        Logger logger = Logger.getLogger(task_2.class.getName());
        try {
                FileHandler fh = new FileHandler("homework_2/log_2.txt", true);
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
