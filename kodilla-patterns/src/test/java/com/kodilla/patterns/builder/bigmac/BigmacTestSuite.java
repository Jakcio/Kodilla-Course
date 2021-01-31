package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.BUN_WITH_SESAM)
                .burgers(3)
                .sauce(SauceType.THOUSANDS_ISLANDS)
                .ingredient(IngredientsType.CHILI_PEPPERS)
                .ingredient(IngredientsType.TOMATO)
                .ingredient(IngredientsType.CHEESE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyBurgers = bigmac.getBurgers();
        RollType rollType = bigmac.getRoll();
        SauceType sauceType = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyBurgers);
        assertEquals(rollType, RollType.BUN_WITH_SESAM);
        assertEquals(sauceType, SauceType.THOUSANDS_ISLANDS);
        assertEquals(howManyIngredients, 3);

    }

}
