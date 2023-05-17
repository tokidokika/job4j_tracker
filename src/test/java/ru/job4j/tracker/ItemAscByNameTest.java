package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(new Item("spring"),
                new Item("autumn"),
                new Item("summer"),
                new Item("winter")
        );
        List<Item> expected = Arrays.asList(new Item("autumn"),
                new Item("spring"),
                new Item("summer"),
                new Item("winter")
        );
        items.sort(new ItemAscByName());
        assertThat(expected).isEqualTo(items);
    }
}