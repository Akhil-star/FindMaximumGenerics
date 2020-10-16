package com.cg.generics;


import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{

    T[] element;
    public FindMaximum(T... elements){
        this.element=elements;
    }

    public T testMax(){
        return FindMaximum.testMax( element );
    }

    public static <T extends Comparable<T>> T testMax(T... elements) {
        T max = elements[0];
        if (elements == null) {
            System.out.println( "Could not find maximum" );
            return null;
        } else {
            for (T element : elements) {
                if (element.compareTo( max ) > 0) {
                    max = element;
                }
            }
            return max;
        }
    }


    public static void main (String args[]){
        System.out.println(new FindMaximum( 10,12,7,2,15 ).testMax());
        System.out.println(new FindMaximum( 10.2f,12.4f,7.8f ).testMax());
        System.out.println(new FindMaximum( "Apple","Peach","Banana" ).testMax());

    }
}
