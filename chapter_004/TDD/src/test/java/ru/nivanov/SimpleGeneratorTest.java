package ru.nivanov;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Nikolay Ivanov on 22.03.2017.
 */
public class SimpleGeneratorTest {
    /**
     * Test for normal condition.
     * @throws KeysException ..
     */
    @Test
    public void whenGenerateOkThenReturnResult() throws KeysException {
        String template = "I am ${name}, Who are ${subject}?";
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Petr");
        map.put("subject", "you");
        SimpleGenerator underTest = new SimpleGenerator();
        String result = underTest.generate(template, map);
        String expected = "I am Petr, Who are you?";
        assertThat(result, is(expected));
    }

    /**
     * Test for more keys in map.
     * @throws KeysException ..
     */
    @Test(expected = KeysException.class)
    public void whenGenerateMoreKeysInMapThenReturnResult() throws KeysException {
        String template = "Help, ${sos}, ${sos}, ${sos}";
        HashMap<String, String> map = new HashMap<>();
        map.put("sos", "Aaa");
        map.put("subject", "you");
        SimpleGenerator underTest = new SimpleGenerator();
        underTest.generate(template, map);

    }

    /**
     * Test for less keys in map.
     * @throws KeysException ..
     */
    @Test(expected = KeysException.class)
    public void whenGenerateLessKeysInMapThenReturnResult() throws KeysException {
        String template = "I am ${name}, Who are ${subject}?";
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Petr");
        //map.put("subject", "you");
        SimpleGenerator underTest = new SimpleGenerator();
        underTest.generate(template, map);

    }

}