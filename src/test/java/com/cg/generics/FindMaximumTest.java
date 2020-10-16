package com.cg.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {


    @Test
    public void given3Integers_whenGiven_ShouldReturnFirstIntegerMax(){
        Assert.assertSame( 15,new FindMaximum( 15,7,5,10 ).testMax() );
    }

    @Test
    public void given3Integers_whenGiven_ShouldReturnSecondIntegerMax(){
        Assert.assertSame( 10,new FindMaximum( 7,10,5 ).testMax() );
    }

    @Test
    public void given3Integers_whenGiven_ShouldReturnThirdIntegerMax(){
        Assert.assertSame( 10,new FindMaximum( 5,7,10 ).testMax() );
    }
    
    @Test
    public void given3Float_whenGiven_ShouldReturnFirstFloatMax(){
        Assert.assertEquals( 10.4f,new FindMaximum( 10.4f,7.2f,5.5f ).testMax()  );
    }

    @Test
    public void given3Float_whenGiven_ShouldReturnSecondFloatMax(){
        Assert.assertEquals( 10.4f,new FindMaximum( 7.2f,10.4f,5.5f ).testMax()  );
    }

    @Test
    public void given3Float_whenGiven_ShouldReturnThirdFloatMax(){
        Assert.assertEquals( 10.4f,new FindMaximum( 7.2f,5.5f,10.4f ).testMax()  );
    }

    @Test
    public void given3String_whenGiven_ShouldReturnFirstStringMax(){
        Assert.assertEquals( "Peach",new FindMaximum( "Peach","Apple","Banana" ).testMax()  );
    }

    @Test
    public void given3String_whenGiven_ShouldReturnSecondStringMax(){
        Assert.assertEquals( "Peach",new FindMaximum( "Apple","Peach","Banana" ).testMax()  );
    }

    @Test
    public void given3String_whenGiven_ShouldReturnThirdStringMax(){
        Assert.assertEquals( "Peach",new FindMaximum( "Apple","Banana","Peach" ).testMax()  );
    }
}
