package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Constants.CatConst.CAT_SOUND;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest
{
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp()
    {
        cat = new Cat(feline);
    }


    @Test
    public void getCatSoundTest()
    {
        String actual = cat.getSound();

        assertEquals(CAT_SOUND, actual);
    }

    @Test
    public void getCatFoodTest() throws Exception
    {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
