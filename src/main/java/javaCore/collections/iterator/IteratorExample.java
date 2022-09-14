package javaCore.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5);
        List<Integer> myArray = new ArrayList<>(myList);

        //Простой проход с помощью итератора
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

        //Удаление элемента  помощью итератора
        Iterator<Integer> arrayIterator = myArray.iterator();
        for (Iterator<Integer> iterator1 = myArray.iterator(); iterator1.hasNext();) {
            Integer next = iterator1.next();
            if(next % 2 != 0) iterator1.remove();
        }
        System.out.println(myArray);

        //Удаление элемента в функциональном стиле
        List<String> newArray = new ArrayList<>();
        newArray.add("kobez");
        newArray.add("evgen");
        newArray.add("sosok");
        newArray.removeIf(next -> next.equals("sosok"));
        System.out.println(newArray);


    }
}
