package lab11.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        map.add("key1", "value1");
        map.add("key2", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("value1", map.getFirst("key1"));
        Assertions.assertEquals("value2", map.getFirst("key2"));
    }

    @Test
    public void testGetFirst() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals("value1", map.getFirst("key"));
        Assertions.assertNotEquals("value2", map.getFirst("key"));
    }

    @Test
    public void testContainsKey() {
        map.add("key1", "value1");
        map.add("key2", "value");
        Assertions.assertTrue(map.containsKey("key1"));
        Assertions.assertFalse(map.containsKey("key3"));
    }

    @Test
    public void testSize() {
        map.add("key1", "value1");
        map.add("key1", "value2");
        Assertions.assertEquals(1, map.size());
    }

    @Test
    public void testRemoveKey() {
        map.add("key1", "value1");
        map.remove("key1");
        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    public void testAddAllWithList() {
        List<String> list = new ArrayList<String>();
        list.add("value1");
        list.add("value2");
        map.addAll("key1", list);
        Assertions.assertEquals(list, map.getValues("key1"));
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        MultiMapValue<String, String> map = new MultiMapValue<>();
        map.add("key1", "value1");
        map.add("key2", "value2");
        this.map.addAll(map);
        Assertions.assertEquals("value2", map.getFirst("key2"));
    }
}
