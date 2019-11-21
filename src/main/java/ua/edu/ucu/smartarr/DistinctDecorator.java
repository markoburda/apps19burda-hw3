package ua.edu.ucu.smartarr;

import java.util.HashSet;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        HashSet<Object> hashSet = new HashSet<>(Arrays.asList(smartArray.toArray()));
        array = hashSet.toArray();
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray. Use method equals() to compare objects";
    }
}
