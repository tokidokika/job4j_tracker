package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    //private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        /*for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }*/
        for (Item element: items) {
            if (element.getId() == id) {
                rsl = items.indexOf(element);
                break;
            }
        }
        return rsl;
    }

    public List<Item> findAll() {
        //return Arrays.copyOf(items, size);
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        /*Item[] itemName = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                itemName[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(itemName, count);*/
        List<Item> itemName = new ArrayList<>();
        for (Item element: items) {
            if (element.getName().contains(key)) {
                itemName.add(element);
            }
        }
        return itemName;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            //items[index] = item;
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        /*if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }*/
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
 }