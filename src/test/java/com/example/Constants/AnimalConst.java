package com.example.Constants;

import java.util.List;

public class AnimalConst
{
    public static final String PREDATOR_ANIMAL = "Хищник";
    public static final List<String> PREDATOR_ANIMAL_FOOD_LIST = List.of("Животные", "Птицы", "Рыба");

    public static final String HERBIORE_ANIMAL = "Травоядное";
    public static final List<String> HERBIORE_ANIMAL_FOOD_LIST = List.of("Трава", "Различные растения");

    public static final String UNKNOWN_ANIMAL = "Абра-кодабра";
    public static final String UNKNOWN_ANIMAL_FOOD = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

    public static final String EXPECTED_ANIMAL_FAMILY = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
}
