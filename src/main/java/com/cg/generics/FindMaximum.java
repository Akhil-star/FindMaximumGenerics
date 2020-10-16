package com.cg.generics;
import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{

    T[] elements;
    public FindMaximum(T... elements){
        this.elements=elements;
    }

    public T testMax(){
        return FindMaximum.testMax( elements );
    }

    public static <T extends Comparable<T>> T testMax(T... elements) {
        T max;
        if (elements == null) {
            System.out.println( "Could not find maximum" );
            return null;
        }else {
            Arrays.sort( elements );
            max= elements[elements.length-1];
        }
        printMax( max,elements );
        return max;
    }

    public static <T> void printMax(T max, T... elements){
        System.out.println( "Maximum element is : "+max );
    }

    public static void main (String args[]){
        new FindMaximum( 10,12,7,2,15 ).testMax();
        new FindMaximum( 10.2f,12.4f,7.8f ).testMax();
        new FindMaximum( "Apple","Peach","Banana" ).testMax();
    }
}
