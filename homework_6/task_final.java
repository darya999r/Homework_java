package homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class task_final {
    public static void main(String[] args) {
        //заполняем экземпляры класса
        Laptop lap1 = new Laptop(1, 512, 16, 6, 39, 55000,  
        "BJD456-9056", "DOS", "AMD Ryzen 5", 
        "IPS", "plastic", "silvery", 17.9, 
        358.5, 242, 1.69);

        Laptop lap2 = new Laptop(2,  216, 12, 4, 24, 35000,  
        "BNJ9485-JK", "Windows 10", "AMD Ryzen 5", 
        "IPS", "plastic", "white", 12.3, 
        285.5, 207.5, 1.56);

        Laptop lap3 = new Laptop(3, 115, 12, 4, 43, 40000,  
        "CVKMDF-6789", "Linux", "AMD Ryzen 5", 
        "IPS", "plastic", "silvery", 19.5, 
        395.5, 282, 2.74);

        Laptop lap4 = new Laptop(4, 512, 16, 8, 45, 75000,  
        "NCLLL-45", "Windows 10", "AMD Ryzen 5", 
        "IPS", "metal", "black", 23.5, 
        416.5, 304, 2.85);

        Laptop lap5 = new Laptop(5, 216, 16, 6, 24, 48000,  
        "cJDndd88990", "Windows 10", "AMD Ryzen 5", 
        "IPS", "metal", "black", 10.5, 
        274.5, 203, 1.36);

        //складываем их в HashSet
        HashSet<Laptop> lapSet = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5));

        //выводим список экземпляров
        printSet(lapSet);

        //фильтруем список и выводим подходящие варианты 
        HashSet<Laptop> filterSet = filter(lapSet);
        printSet(filterSet);

    }

    static void printSet(HashSet<Laptop> lapSet){
        for (Laptop laptop : lapSet) {
            if (laptop != null){
                System.out.println(laptop);
            }
        }
    }

    static HashSet<Laptop> filter(HashSet<Laptop> lap) {
        //создаем изначальный HashSet, который потом будем менять
        //в зависимости от фильтра пользователя
        HashSet<Laptop> userLaptops = new HashSet<>(lap); 

        //создаем HashSet с описанием фильтрации
        HashMap<Integer, String> mapFilter = new HashMap<>();
        
        mapFilter.put(1, "RAM");
        mapFilter.put(2, "hardDisk");
        mapFilter.put(3, "operatingSystem");
        mapFilter.put(4, "color");
        mapFilter.put(5, "diagonal");
        mapFilter.put(6, "numbers of cores");
        mapFilter.put(7, "weight");
        mapFilter.put(8, "price");

        //выводим список фильтрации 
        for (Map.Entry<Integer, String> el : mapFilter.entrySet()) {
            System.out.println(el.getKey() + " - " + el.getValue());
        }

        //получаем параметры фильтрации от пользователя
        System.out.print("Enter numbers of filtering criteria (example 1,2 or 7): ");
        Scanner iScanner = new Scanner(System.in);
        String input = iScanner.next();

        //создаем список пользовательской фильтрации по номеру
        ArrayList<Integer> choice = new ArrayList<>();
        for (String userInput : input.split(",")) {
            if (mapFilter.containsKey(Integer.parseInt(userInput))) {
                choice.add(Integer.parseInt(userInput));
            }
        }
        //создаем HashMap фильтрации пользователя с номером и названием фильтра 
        HashMap<Integer, String> userFilter = new HashMap<>();
        for (int i = 0; i < choice.size(); i++) {
            userFilter.put(choice.get(i), mapFilter.get(choice.get(i)));
        }
        //меняем название фильтра на минимальное значение фильтра или строку с названием 
        for (Integer i : choice) {
            System.out.print("Enter filtering criteria by " + userFilter.get(i) + ": ");
            if (iScanner.hasNext()) {
                input = iScanner.next();
                userFilter.put(i, input);
            }
        }
        iScanner.close();
        //выводим фильтр пользователя
        System.out.println("Filter: " + userFilter);

        //применяем фильтр пользователя и передаем в main
        for (Map.Entry<Integer, String> entry : userFilter.entrySet()) {
            userLaptops.removeIf(laptop -> !laptop.filteringCriteria(entry.getKey(), entry.getValue()));
        }

        return userLaptops;
    }
}
