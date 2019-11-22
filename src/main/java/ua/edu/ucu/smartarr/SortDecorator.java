package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator sortFunc){
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).sorted(sortFunc::compare).toArray();
    }

    @Override
    public String operationDescription(){
        return "Sorts elements using MyComparator to compare them";
    }
}
