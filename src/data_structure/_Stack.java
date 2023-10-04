package data_structure;

import java.util.Map;
import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {

        Stack<Integer> integersStack = new Stack<>();

        // fill with random values
        int i = 1;
        do {
            integersStack.push(( int ) (Math.random() * (20 + 1)));
            i++;
        }while (i <= 10);

        //retrieves and Pop from top
        System.out.println("Deleted element " + integersStack.pop());
        //get length of the stack
        System.out.println("length is " + integersStack.size());
        //retrieves from top
        System.out.println("The first element is " + integersStack.peek());
        //Add at the top and retrieves
        System.out.println("Pushed element is " + integersStack.push(99));
    }
}
