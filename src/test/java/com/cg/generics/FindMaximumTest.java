package com.cg.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    FindMaximum findMaximum = new FindMaximum();
    @Test
    public void given3Integers_whenGiven_ShouldReturnFirstIntegerMax(){
        Integer findMax = findMaximum.testMax(10,7,5);
        Assert.assertSame( 10,findMax );
    }

    @Test
    public void given3Integers_whenGiven_ShouldReturnSecondIntegerMax(){
        Integer findMax = findMaximum.testMax(5,10,7);
        Assert.assertSame( 10,findMax );

    }

    @Test
    public void given3Integers_whenGiven_ShouldReturnThirdIntegerMax(){
        Integer findMax = findMaximum.testMax(5,7,10);
        Assert.assertSame( 10,findMax );
    }
}
