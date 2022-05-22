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
        return null;
    }

    public Item delete(int id) {
        return null;
    }

    public Item edit(int id, Item item) {
        return null;
    }

    public Item findByName(int id, Item item) {
        return null;
    }

    public Item findAll() {
        return null;
    }
}
