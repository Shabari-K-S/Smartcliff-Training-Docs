package com.self_practice;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequePractice {
    private ArrayDeque<Character> characterDeque = new ArrayDeque<Character>();

    public void addCharacters() {
        characterDeque.add('A');
        characterDeque.add('B');
        characterDeque.add('C');
        characterDeque.add('D');
        characterDeque.add('E');
        characterDeque.add('F');
    }

    public void addCharactersAtBothEnds() {
        characterDeque.addFirst('X');
        characterDeque.addLast('Y');
    }

    public Character removeFirstCharacter() {
        return characterDeque.pollFirst();
    }

    public Character removeLastCharacter() {
        return characterDeque.pollLast();
    }

    public Character peekFirstCharacter() {
        return characterDeque.peekFirst();
    }

    public Character peekLastCharacter() {
        return characterDeque.peekLast();
    }

    public void accessCharacterAtIndex(int index) {
        Iterator<Character> iterator = characterDeque.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (i == index) {
                System.out.println(iterator.next());
                break;
            }
            iterator.next();
            i++;
        }
    }

    public boolean isEmpty() {
        return characterDeque.isEmpty();
    }

    public int size() {
        return characterDeque.size();
    }

    public void addMoreCharacters() {
        characterDeque.add('G');
        characterDeque.add('H');
        characterDeque.add('I');
        characterDeque.add('J');
        characterDeque.add('K');
        characterDeque.add('L');
        characterDeque.add('M');
    }

    public void removeCharacters() {
        characterDeque.pollFirst();
        characterDeque.pollFirst();
        characterDeque.pollLast();
        characterDeque.pollLast();
    }

    public void iterateCharacters() {
        Iterator<Character> iterator = characterDeque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void iterateCharactersDescending() {
        Iterator<Character> iterator = characterDeque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void convertToArray() {
        Character[] characters = characterDeque.toArray(new Character[0]);
        for (Character character : characters) {
            System.out.println(character);
        }
    }

    public void clearCharacters() {
        characterDeque.clear();
    }

    public static void main(String[] args) {
        ArrayDequePractice deque = new ArrayDequePractice();
        deque.addCharacters();
        deque.addCharactersAtBothEnds();

        System.out.println(deque.removeFirstCharacter());

        System.out.println(deque.removeLastCharacter());

        System.out.println(deque.peekFirstCharacter());
        System.out.println(deque.peekLastCharacter());

        deque.accessCharacterAtIndex(2);

        System.out.println(deque.isEmpty());
        System.out.println(deque.size());

        deque.addMoreCharacters();
        deque.removeCharacters();

        deque.iterateCharacters();
        deque.iterateCharactersDescending();
        deque.convertToArray();

        deque.clearCharacters();
        System.out.println(deque.isEmpty());
    }
}