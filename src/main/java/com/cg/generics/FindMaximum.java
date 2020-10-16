package com.cg.generics;

import java.util.Scanner;

public class FindMaximum {

    public static <T extends Comparable<T>> T testMax(T x,T y,T z){
        T max = x;
        if(y.compareTo( max )>0){
            max = y;
        }
        if(z.compareTo( max )>0){
            max = z;
        }
        return max;
    }

    public static void main (String args[]){
        System.out.println(testMax( 10,12,7 ));
        System.out.println(testMax( 10.2f,12.4f,7.8f ));
        System.out.println(testMax( "Apple","Peach","Banana" ));


    }
}
