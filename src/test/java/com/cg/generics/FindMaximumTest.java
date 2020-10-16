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
    
    @Test
    public void given3Float_whenGiven_ShouldReturnFirstFloatMax(){
        Float findMax = findMaximum.testMax(10.4f,7.2f,5.5f);
        Assert.assertEquals( 10.4,findMax ,0.001);
    }

    @Test
    public void given3Float_whenGiven_ShouldReturnSecondFloatMax(){
        Float findMax = findMaximum.testMax(5.5f,10.4f,7.2f);
        Assert.assertEquals( 10.4,findMax ,0.001);

    }

    @Test
    public void given3Float_whenGiven_ShouldReturnThirdFloatMax(){
        Float findMax = findMaximum.testMax(5.5f,7.2f,10.4f);
        Float f=new Float( 10.4f );
        Assert.assertEquals( f,findMax,0.001);
    }
}
