package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            Character symbol = evenElements.pollFirst();
            if (i % 2 == 0) {
                str.append(symbol);
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            str.append(descendingElements.pollLast());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
