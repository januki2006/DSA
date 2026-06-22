/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author STZ
 */
public class UnboundedArrayStack {

    private int[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;
        stack = new int[capacity];
        top = -1;
    }

    private void resize(int newCapacity) {
        int[] newStack = new int[newCapacity];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        capacity = newCapacity;

        System.out.println("Resized to " + capacity);
    }

    public void push(int data) {

        if (top + 1 == capacity) {
            resize(capacity * 2);
        }

        stack[++top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int removed = stack[top--];

        if (top + 1 <= capacity / 4 && capacity > 2) {
            resize(capacity / 2);
        }

        return removed;
    }

    public int peek() {

        if (top == -1) {
            return -1;
        }

        return stack[top];
    }

    public void display() {

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();
    }
}
