package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.Constants.FelineConst.*;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest
{

    @Spy
    Feline feline;



    @Test
    public void eatMeatFelineTest() throws Exception
    {
        Mockito.when(feline.getFood(FELINE_PREDATOR)).thenReturn(PREDATOR_FELINE_FOOD_LIST);
        List<String> actualResult = feline.eatMeat();
        assertEquals(PREDATOR_FELINE_FOOD_LIST,actualResult);
    }

    @Test
    public void getFamilyTest ()
    {
        String actualResult =  feline.getFamily();
        assertEquals(FELINE_FAMILY, actualResult);
    }

    @Test
    public void getKittensWithOutInputTest()
    {
        int actualResult = feline.getKittens();
        assertEquals(EXPECTED_FELINE_STATIC_ONE_KITTEN, actualResult);
    }

    @Test
    public void getKittensWithInputTest()
    {
        int actualResult = feline.getKittens(EXPECTED_FELINE_STATIC_MANY_KITTENS);
        assertEquals(EXPECTED_FELINE_STATIC_MANY_KITTENS, actualResult);
    }
}
