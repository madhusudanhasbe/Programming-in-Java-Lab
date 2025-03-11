package Assignment6_1;

import java.util.ArrayList;

public class Growable_STK implements Interface_STK {
    private final ArrayList<Integer> stack = new ArrayList<>(5);
    private int top = -1;

    @Override
    public void push(int element) {
        stack.add(element);
        top++;
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int element = stack.get(top);
            stack.remove(top);
            top--;
            return element;
        }
    }

    @Override
    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Growable Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
            System.out.println("Current size of stack: " + stack.size());
        }
    }

    @Override
    public boolean isOverflow() {
        return false;
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }
}
