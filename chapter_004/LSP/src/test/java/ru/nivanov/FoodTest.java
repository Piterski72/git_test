package ru.nivanov;

import org.junit.Test;
import ru.nivanov.Foods.Food;
import ru.nivanov.Foods.VegetableFood;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Nikolay Ivanov on 02.03.2017.
 */
public class FoodTest {
    private static final double STO = 100;

    /**
     * Test for food freshness.
     * @throws Exception ..
     */
    @Test
    public void whenGetShelfLifePercentThenReturnResult() throws Exception {
        Food onion = new VegetableFood("onion", 1, "01.03.2017", "11.03.2017");
        Food potato = new VegetableFood("potato", 1, "01.03.2016", "11.03.2016");
        boolean testOne = (onion.getShelfLifePercent() < STO);
        boolean testTwo = (potato.getShelfLifePercent() < STO);
        boolean[] results = {testOne, testTwo};
        boolean[] expected = {true, false};
        assertThat(results, is(expected));
    }
}