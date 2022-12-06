//1) Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, 
//помещает их в очередь и выводит на консоль содержимое очереди.

package homework_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class task_3 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(55, 3, 95, 21, 14, 5);
        System.out.println(list1);
        System.out.print("stack: ");
        stack(list1);
        System.out.println(" ");
        System.out.print("queue: ");
        queue(list1);
    }

    static void stack(List<Integer> list) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(list);
        while (!myStack.isEmpty()) {
            Integer value = myStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }

    static void queue(List<Integer> list) {
        Queue<Integer> myQueue = new LinkedList<>(list);
        while(myQueue.peek()!=null) {
            System.out.print(myQueue.remove());
            System.out.print(" ");
        }
    }
}
