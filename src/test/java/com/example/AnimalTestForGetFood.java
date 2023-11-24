package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static com.example.Constants.AnimalConst.*;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalTestForGetFood
{
    private final String animalType;
    private final List<String> animalFood;

    Animal animal;

    public AnimalTestForGetFood(String animalType, List<String> animalFood)
    {
        this.animalType = animalType;
        this.animalFood = animalFood;
    }

    @Before
    public void setUp()
    {
        animal = new Animal();
    }

    @Parameterized.Parameters
    public static Object[][] getParameters()
    {
        return new Object[][]
                {
                        {PREDATOR_ANIMAL, PREDATOR_ANIMAL_FOOD_LIST},
                        {HERBIORE_ANIMAL, HERBIORE_ANIMAL_FOOD_LIST}
                };
    }

    @Test
    public void getFoodTest() throws Exception
    {
        List<String> actualResult = animal.getFood(animalType);
        assertEquals(animalFood, actualResult);
    }
}

