package com.example;


import org.junit.Before;
import org.junit.Test;


import static com.example.Constants.AnimalConst.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AnimalTest
{

    Animal animal;

    @Before
    public void setUp()
    {
        animal = new Animal();
    }

    @Test
    public void getAnimalFoodUnknownAnimalTest()
    {
        Exception exception = assertThrows(Exception.class, () ->
        {
            animal.getFood(UNKNOWN_ANIMAL);
        });
        assertEquals(UNKNOWN_ANIMAL_FOOD, exception.getMessage());
    }

    @Test
    public void getAnimalFamilyTest()
    {
        String actualResult = animal.getFamily();
        assertEquals(EXPECTED_ANIMAL_FAMILY, actualResult);
    }
}
