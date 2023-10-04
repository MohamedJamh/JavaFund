package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
//        System.out.println("Incremented " + incrementByOneFunction.apply(0));
//        System.out.println("multiplied " + multiplyByTeen.apply(0));
        System.out.println("Function \n");
        System.out.println(incrementThenMultiply.apply(2));
        System.out.println("BiFunction \n");
        System.out.println(squareThenIncrement.apply(5,1));

    }

    static Function<Integer, Integer> incrementByOneFunction = (number) -> ++number;
    static Function<Integer, Integer> multiplyByTeen = (number) -> number * 10;



    //Function
    static Function<Integer, Integer> incrementThenMultiply = incrementByOneFunction.andThen(multiplyByTeen); // executes increments then multiply
    static Function<Integer, Integer> multiplyThenIncrement = incrementByOneFunction.compose(multiplyByTeen); // executes multiply then increments

    //BiFunction
    static BiFunction<Integer, Integer, Integer> squareThenIncrement = (number,incrementBy) -> (number * number) + incrementBy;

}
