package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static com.example.Constants.LionConst.*;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParamTest extends Exception
{
    private Lion lion;
    @Mock
    Feline feline;

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public int lionExpectedKittens;


    @Parameterized.Parameters()
    public static Object[][] data()
    {
        return new Object[][]{
                {MALE_SEX_LION, LION_DEFAULT_KITTEN},
                {FEMALE_SEX_LION, LION_TEST_KITTEN}
        };
    }


    @Before
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void getKittensLionParamTest() throws Exception
    {
        lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(lionExpectedKittens);
        int actualResult = lion.getKittens();
        assertEquals(lionExpectedKittens, actualResult);
    }


    @Test
    public void getFoodLionParamTest() throws Exception
    {
        lion = new Lion(sex, feline);

        Mockito.when(feline.getFood(PREDATOR_LION)).thenReturn(PREDATOR_LION_FOOD_LIST);
        List<String> actualResult = lion.getFood();
        assertEquals(PREDATOR_LION_FOOD_LIST, actualResult);
    }

    @Test
    public void doesHaveManeTrueLionParamTest() throws Exception
    {
        lion = new Lion(sex, feline);

        boolean hasMane = lion.doesHaveMane();
        assertEquals(TRUE_IF_MALE, hasMane);
    }

    @Test
    public void doesHaveManeFalseLionParamTest() throws Exception
    {
        lion = new Lion(sex, feline);

        boolean hasMane = lion.doesHaveMane();
        assertEquals(FALSE_IF_FEMALE, hasMane);
    }

    @Test
    public void lionExceptionParamTest()
    {

        Exception exception = assertThrows(Exception.class, () ->
        {
            lion = new Lion(WRONG_SEX_LION, feline);
        });
        assertEquals(UNKNOWN_SEX_LION, exception.getMessage());
    }
}
