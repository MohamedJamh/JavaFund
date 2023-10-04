package data_structure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _LinkedLists {
    public static void main(String[] args) {
        LinkedList<Object> cars = new LinkedList<Object>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Add single value
        cars.add(5);
        cars.add(true);
        int[] intArray = {2,3};
        cars.add(intArray);

        // Add head
        cars.addFirst("added to First");
        // Add tail
        cars.addLast("added to last");
        printLinkedList(cars);

        //Add Collection (Arraylist, linkedList , set)
        cars.addAll(List.of(new String[]{
                "Volkswagen","Audi"
        }));

        cars.add(2,"Index added element");
        printLinkedList(cars);
    }

    public static void printLinkedList(LinkedList<Object> linkedList){
        System.out.println("----------");
        linkedList.stream().forEach( x -> {
            if(x instanceof int[] ) System.out.println(Arrays.toString((int[]) x));
            else System.out.println(x);
        });
    }
}
