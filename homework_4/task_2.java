//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package homework_4;

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(78);
        intList.add(5);
        intList.add(19);
        System.out.println(intList);
        //добавляем три новых числа в конец списка
        enqueue(intList, 88);
        System.out.println("Add new number in the end list: " + intList);
        enqueue(intList, 12);
        System.out.println("Add new number in the end list: " + intList);
        enqueue(intList, 76);
        System.out.println("Add new number in the end list: " + intList);
        //выводим первое число из списка и удаляем его
        System.out.println("First number " + dequeue(intList) + " removed from list: " + intList);
        //выводим первое число в списке, не удаляя его
        System.out.println("First number in the list: " + first(intList));
        //выводим первое число из списка и удаляем его
        System.out.println("First number " + dequeue(intList) + " removed from list: " + intList);
        //выводим первое число в списке, не удаляя его
        System.out.println("First number in the list: " + first(intList));
    }

    //помещает элемент в конец очереди
    static LinkedList<Integer> enqueue(LinkedList<Integer> list, Integer num) {
        list.add(num);
        return list;
    }

    // dequeue() - возвращает первый элемент из очереди и удаляет его
    static Integer dequeue(LinkedList<Integer> list) {
        Integer firstNum = list.get(0);
        list.remove(0);
        return firstNum;
    }

    //first() - возвращает первый элемент из очереди, не удаляя
    static Integer first(LinkedList<Integer> list) {
        Integer firstNum = list.get(0);
        return firstNum;
    }
}
