package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


import static com.example.Constants.LionConst.*;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest extends Exception
{
    private Lion lion;
    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception
    {
        lion = new Lion(MALE_SEX_LION, feline);
        Mockito.when(feline.getKittens()).thenReturn(LION_DEFAULT_KITTEN);
        int actualResult = lion.getKittens();
        assertEquals(LION_DEFAULT_KITTEN, actualResult);
    }

    @Test
    public void lionExceptionTest()
    {

        Exception exception = assertThrows(Exception.class, () -> {
            lion = new Lion(WRONG_SEX_LION,feline);
        });
        assertEquals(UNKNOWN_SEX_LION ,exception.getMessage());
    }


    @Test
    public void getFoodLionTest() throws Exception
    {
        lion = new Lion(FEMALE_SEX_LION, feline);

        Mockito.when(feline.getFood(PREDATOR_LION)).thenReturn(PREDATOR_LION_FOOD_LIST);
        List<String> actualResult = lion.getFood();
        assertEquals(PREDATOR_LION_FOOD_LIST,actualResult);
    }

    @Test
    public void doesHaveManeLionTest() throws Exception
    {
        lion = new Lion(MALE_SEX_LION, feline);

        boolean hasMane = lion.doesHaveMane();
        assertEquals(TRUE_IF_MALE,hasMane);

    }
}
