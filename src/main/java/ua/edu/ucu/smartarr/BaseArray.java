package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements  SmartArray{

    private Object[] array;

    public BaseArray(Object[] array) {
        this.array = array.clone();
    }


    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public String operationDescription(){
        return "Base array for decorators";
    }
}
