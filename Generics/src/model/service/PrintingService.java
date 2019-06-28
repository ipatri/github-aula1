package model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintingService<T> {
    private List<T> values = new ArrayList<>();

    public void addValue(T value){
        values.add(value);
    }
    public void first(){
        if(values.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        System.out.println( values.get(0));
    }
    public void print(){
        System.out.print("[");
        if(!values.isEmpty()){
            System.out.print(values.get(0));
        }
        for (int i=1;i<values.size();i++){
            System.out.print(", "+values.get(i));
        }
        System.out.println("]");
    }
}
