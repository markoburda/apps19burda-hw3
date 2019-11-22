package ua.edu.ucu.smartarr;

import java.util.LinkedHashSet;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>(Arrays.asList(smartArray.toArray()));
        array = linkedHashSet.toArray();
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray. Use method equals() to compare objects";
    }
}
