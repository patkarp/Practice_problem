import java.io.*;
import java.util.*;
import java.lang.*;

class ArraylistObjectComparator{
    private String name;
    private Integer age;
    public ArraylistObjectComparator(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    public static void main(String[] args){
        ArrayList a = new ArrayList<>();
        a.add(new ArraylistObjectComparator("ABC", 23) );
        a.add(new ArraylistObjectComparator("asd", 33) );
        a.add(new ArraylistObjectComparator("gads", 43) );
        a.add(new ArraylistObjectComparator("q1we", 28) );
        a.add(new ArraylistObjectComparator("qwet", 13) );
        a.add(new ArraylistObjectComparator("las", 53) );

        System.out.print(a);
        //Sorting
        a.sort(Comparator.comparingInt(getName()));
        System.out.print("Sorted : " +a);
    }
}