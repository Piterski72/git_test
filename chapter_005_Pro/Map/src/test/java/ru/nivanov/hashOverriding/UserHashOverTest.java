package ru.nivanov.hashOverriding;

import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Nikolay Ivanov on 10.05.2017.
 */
public class UserHashOverTest {

    /**
     * Test for adding users when override hashCode and no override to equals.
     */
    @Test
    public void whenAddUsersWithOverridedHashcode() {

        UserHashOver one = new UserHashOver("Ann", 1, new GregorianCalendar(1998, 12, 10));
        UserHashOver two = new UserHashOver("Ann", 1, new GregorianCalendar(1998, 12, 10));

        Map<UserHashOver, Object> userObjectMap = new HashMap<>();
        userObjectMap.put(one, "first");
        userObjectMap.put(two, "second");

        System.out.println(userObjectMap);

        assertThat(userObjectMap.size(), is(2));

    }
}