// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки. 
// Если значение null, то параметр не должен попадать в запрос. 
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package homework_2;

import java.util.HashMap;

public class task_1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", "null");
        System.out.println(map);

        System.out.print("select * from students where ");
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (value != "null") {
                System.out.print(" " + key + " = " + value + ";");
            }
            
        }
    }
}
