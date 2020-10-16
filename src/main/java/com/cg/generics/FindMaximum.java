package com.cg.generics;

import java.util.Scanner;

public class FindMaximum <T extends Comparable<T>>{

    T x,y,z;
    public FindMaximum(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public T testMax(){
        return FindMaximum.testMax( x,y,z );
    }

    public static <T extends Comparable<T>> T testMax(T x,T y,T z){
        T max = x;
       if (max==null){
            System.out.println("Could not find maximum");
        }
        if(y.compareTo( max )>0){
            max = y;
        }
        if(z.compareTo( max )>0){
            max = z;
        }
        return max;
    }

    public static void main (String args[]){
        System.out.println(new FindMaximum( 10,12,7 ).testMax());
        System.out.println(new FindMaximum( 10.2f,12.4f,7.8f ).testMax());
        System.out.println(new FindMaximum( "Apple","Peach","Banana" ).testMax());


    }
}
