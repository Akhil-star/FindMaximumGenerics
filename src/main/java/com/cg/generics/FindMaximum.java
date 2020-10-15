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

    public static void main (String args[]){
        Scanner sc = new Scanner( System.in );
        System.out.println(testMax( 10,12,7 ));
    }
}
