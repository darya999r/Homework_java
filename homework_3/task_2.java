// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

package homework_3;

import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(45);
        array.add(18);
        array.add(3);
        array.add(83);
        array.add(12);
        array.add(5);
        array.add(27);
        array.add(38);

        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2==0) {
                array.remove(i);
            }
        }

        System.out.println(array);
    }
}
