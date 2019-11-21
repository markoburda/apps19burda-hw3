package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends  SmartArrayDecorator{
    public FilterDecorator(SmartArray smartArray, MyPredicate filterFunc) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).filter(filterFunc::test).toArray();
    }

    @Override
    public String operationDescription() {
        return "Tests every element and removes it if it doesn't satisfy MyPredicate";
    }
}
