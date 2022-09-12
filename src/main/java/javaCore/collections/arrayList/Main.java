package javaCore.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();

        myArray.add(1);  // bO = O(1)
        myArray.add(3);
        myArray.add(5);
        myArray.add(7);
        myArray.add(9);

        System.out.println(myArray.get(2));  // 5; bO = O(1)
    }
}
