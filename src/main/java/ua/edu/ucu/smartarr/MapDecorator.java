package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;
import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    public MapDecorator(SmartArray smartArray, MyFunction mapFunc){
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).map(mapFunc::apply).toArray();
    }

    @Override
    public String operationDescription() {
        return "Applying given function to each element of collection";
    }
}
