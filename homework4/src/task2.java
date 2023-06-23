// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task2 {

    public static void execute(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(65);
        list.add(22);
    }


    public static  LinkedList<Integer> enqueue(LinkedList<Integer> list, int elmnt){
        list.addLast(elmnt); return list;
    }


    public static LinkedList<Integer> dequeue(LinkedList<Integer> list){
        list.pollFirst(); return list;
    }

    public static LinkedList<Integer> first(LinkedList<Integer> list){
        list.peekFirst(); return list;
    }

    
}

