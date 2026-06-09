package Step_June;

import java.util.ArrayList;
import java.util.Collections;

public class June_5 {
    private int capacity = 4;
    ArrayList<Integer> dynamicArray;
    ArrayList<Integer> firstDeque = new ArrayList<>(capacity);
    int first = 1;
    int last = 2;
    int size;

    public June_5() {
        dynamicArray = new ArrayList<>(Collections.nCopies(capacity, null));

    }

    public ArrayList<Integer> createNewDeque(){
        if(firstDeque.size() == capacity){
            return new ArrayList<>(capacity);
        }
        return firstDeque;
    }

    public void insertFront(int value) {
        if(firstDeque.size() == capacity){
            ArrayList<Integer> newFirstDeque = createNewDeque();
            first = capacity-1;
            newFirstDeque.add(first,value);
            first--;
        }
        firstDeque.add(first,value);
        first--;
    }

    public void insertLast(int value){
        if(firstDeque.size() == capacity){
            ArrayList<Integer> newLastDeque = createNewDeque();
            last = 0;
            newLastDeque.add(last,value);
            last++;
        }
        firstDeque.add(last,value);
        last++;
    }

    public void popFront(){

    }
}
