package data_structure;

import java.util.*;

public class _Set {
    //"Set" is an interface that is part of the Java Collections Framework.
    // It represents a collection of elements that is unordered and does not allow duplicate values and does not offer an indexing system.

    public static <T> void manipulate(Set<T> set,List<T> objectsList){
        set.add(objectsList.get(0));
        System.out.println(set);
        System.out.println("Size :" + set.size());
        set.addAll(objectsList);
        System.out.println(set);
        set.remove(objectsList.get(1));
        System.out.println("removed element : " + objectsList.get(1));
        System.out.println(set);
        set.clear();
        System.out.println("clear set " + set);
        System.out.println("Set is empty " + set.isEmpty());

    }

    static class _HashSet{
        public static void main(String[] args) {
            //random Order - Constant Complexity over basic operations - no duplicates
            Set<String> namesSet = new HashSet<>();
            List<String> names = List.of("Idder","tonaroz","ayour","tilila","karim","ahmed","mohamed");
            _Set.manipulate(namesSet,names);
        }
    }
    static class _LinkedHashSet{
        public static void main(String[] args) {
            //follows insertion order - almost fast as HashSet - no duplicates
            Set<String> namesSet = new LinkedHashSet<>();
            List<String> names = List.of("1th el","2nd el","3rd el","4th");
            _Set.manipulate(namesSet,names);
        }

    }
    static class _TreeSet{
        public static void main(String[] args) {

            //follows natural order - Slow execution on basic operations - no duplicates
            Set<Integer> namesSet = new TreeSet<>();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10 ; i++) {
                numbers.add((int) (Math.random() * (20 - 5 + 1) + 5 )); // Random number between 5 and 20 inclusive
            }
            _Set.manipulate(namesSet,numbers);
        }
    }
}
