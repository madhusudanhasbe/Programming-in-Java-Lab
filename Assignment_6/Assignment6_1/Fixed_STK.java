package Assignment6_1;

public class Fixed_STK implements Interface_STK {
    private int[] stack = new int[5];
    private int top = -1;

    public Fixed_STK(int[] s, int top) {
        super();
        stack = s;
        this.top = top;
    }

    @Override
    public void push(int element) {
        if (isOverflow())
            System.out.println("Stack is Full");
        else {
            top += 1;
            stack[top] = element;
        }
    }

    @Override
    public int pop() {
        int element;
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            element = stack[top];
            top -= 1;
        }
        return element;
    }

    @Override
    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Fixed Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
            System.out.println("Current size of stack: " + (top + 1));
            System.out.println("Total capacity of stack: " + stack.length);
        }
    }

    @Override
    public boolean isOverflow() {
        return top == (stack.length - 1);
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }
}
