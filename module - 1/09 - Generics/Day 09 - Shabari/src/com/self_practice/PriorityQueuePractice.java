package com.self_practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
    private PriorityQueue<Character> tasks = new PriorityQueue<Character>(new Comparator<Character>() {
        @Override
        public int compare(Character task1, Character task2) {
            return task2 - task1;
        }
    });

    public void addTask(Character task) {
        tasks.add(task);
    }

    public Character removeTask() {
        return tasks.poll();
    }

    public Character peekTask() {
        return tasks.peek();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public int size() {
        return tasks.size();
    }

    public void clearTasks() {
        tasks.clear();
    }

    public static void main(String[] args) {
        PriorityQueuePractice queue = new PriorityQueuePractice();
        queue.addTask('A');
        queue.addTask('B');
        queue.addTask('C');
        queue.addTask('D');

        System.out.println(queue.size());
        System.out.println(queue.peekTask());
        System.out.println(queue.removeTask());
        System.out.println(queue.size());
        System.out.println(queue.peekTask());

        queue.clearTasks();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}