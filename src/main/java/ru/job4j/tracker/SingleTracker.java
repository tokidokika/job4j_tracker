package ru.job4j.tracker;

public class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    private static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findByID(int id) {
        return tracker.findById(0);
    }

    public boolean delete(int id) {
        return tracker.delete(1);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(3, item);
    }

    public Item[] findByName(int id, Item item) {
        return tracker.findByName("test1");
    }

    public Item[] findAll() {
        return tracker.findAll();
    }
}
