// 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package homework_3;

import java.util.ArrayList;

public class task_3 {
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
        Integer max = array.get(0);
        Integer min = array.get(0);
        
        
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            } 
        }
        System.out.println("Maximal number in list: " + max);

        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            } 
        }
        System.out.println("Minimal number in list: " + min);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size()-1; i++) {
                if(array.get(i) > array.get(i+1)) {
                    isSorted = false;
                    buf = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set((i+1), buf); 
                }
            }
        }
        System.out.println("Sorted list: " + array);
        Integer listMedian = array.get(array.size()/2);
        System.out.println("List median: " + listMedian);

    }
}