package Exceptions;

// To manage the number of constructions in the town, because the town does not have an infinite area to have all the houses of the world
public class SizeTownAndConstructions extends ArithmeticException{
    public SizeTownAndConstructions(String message) {
        super(message);
    }
}
