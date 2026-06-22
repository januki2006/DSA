/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author STZ
 */
public class ArrayCircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayCircularQueue(int capacity) {

        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {

        if (size == capacity) {
            System.out.println("Queue is Full!");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;

        return removed;
    }

    public void display() {

        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(
                queue[(front + i) % capacity] + " "
            );
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ArrayCircularQueue q =
                new ArrayCircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println(
            "Dequeued: " + q.dequeue()
        );

        q.display();
    }
}
