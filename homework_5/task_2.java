/* 2. Пусть дан список сотрудников:
Иван Иванов 
Светлана Петрова 
Кристина Белова 
Анна Мусина 
Анна Крутова 
Иван Юрин 
Петр Лыков 
Павел Чернов 
Петр Чернышов 
Мария Федорова 
Марина Светлова 
Мария Савина 
Мария Рыкова 
Марина Лугова 
Анна Владимирова 
Иван Мечников 
Петр Петин 
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/

package homework_5;

import java.util.ArrayList;
import java.util.HashMap;

public class task_2 {
    public static void main(String[] args) {
        HashMap<String,String> names = new HashMap<>();
        names.put("Иванов", "Ivan");
        names.put("Петрова", "Svetlana");
        names.put("Белова", "Kristina");
        names.put("Мусина", "Anna");
        names.put("Крутова", "Anna");
        names.put("Юрин", "Ivan");
        names.put("Лыков", "Pitr");
        names.put("Чернов", "Pavel");
        names.put("Чернышов", "Pitr");
        names.put("Федорова", "Marya");
        names.put("Светлова", "Marina");
        names.put("Савина", "Marya");
        names.put("Рыкова", "Marya");
        names.put("Лугова", "Marina");
        names.put("Владимирова", "Anna");
        names.put("Мечников", "Ivan");
        names.put("Петин", "Pitr");
        names.put("Ежов", "Ivan");
        System.out.println(names);
        
        //складываем все имена в отдельный список
        ArrayList<String> listNames = new ArrayList<>(names.values());
        //System.out.println(listNames);

        //создаем мапу с именами и количеством
        HashMap<String,Integer> mapNames = new HashMap<>(sortNames(listNames));
        //System.out.println(mapNames);

        //сортируем имена по убыванию их количества
        printSortNames(mapNames);
    }

    static HashMap<String,Integer> sortNames(ArrayList<String> listNames) {
        HashMap<String,Integer> mapNames = new HashMap<>();
        String name = listNames.get(0);
        int count = 0;
        int index = 0;
        while (index < (listNames.size()-1)) {
            for (int i = 0; i < listNames.size(); i++) {
                if (listNames.get(i) == name) {
                    count++;
                } 
            }
            mapNames.putIfAbsent(name,count);
            index++;
            name = listNames.get(index);
            count = 0;
        }
        return mapNames;
    }

    static void printSortNames(HashMap<String,Integer> mapNames) {
        //создаем отдельный список с количеством повторений имен
        ArrayList<Integer> listCount = new ArrayList<>(mapNames.values());
        //System.out.println(listCount);
        //находим максимальное число повторений
        Integer max = 0;
        for (int i = 0; i < listCount.size(); i++) {
            if (listCount.get(i) > max) {
                max = listCount.get(i);
            }
        }
        //System.out.println(max);
        //выводим имя и количество повторений по возрастанию из мапы
        while (max != 0) {
            for (String key : mapNames.keySet()) {
                Integer value = mapNames.get(key);
                if (value == max) {
                    System.out.print(" " + key + " = " + value + ";");
                }
            }
            max--;
        }
    }
}
