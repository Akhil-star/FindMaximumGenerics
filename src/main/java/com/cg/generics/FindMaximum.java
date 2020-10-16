package com.cg.generics;

import java.util.Scanner;

public class FindMaximum {

    public static Integer testMax(Integer intX,Integer intY,Integer intZ){
        Integer max = intX;
        if(intY.compareTo( max )>0){
            max = intY;
        }
        if(intZ.compareTo( max )>0){
            max = intZ;
        }
        return max;
    }

    public static Float testMax(Float floatX,Float floatY,Float floatZ){
        Float max = floatX;
        if(floatY.compareTo( max )>0){
            max = floatY;
        }
        if(floatZ.compareTo( max )>0){
            max = floatZ;
        }
        return max;
    }

    public static void main (String args[]){
        System.out.println(testMax( 10,12,7 ));
        System.out.println(testMax( 10.2f,12.4f,7.8f ));

    }
}
