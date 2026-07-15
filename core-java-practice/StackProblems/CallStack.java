import java.util.Scanner;

class CallStack {

    // Node class
    static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
            this.next = null;
        }
    }

    private Frame top;

    // Constructor
    public CallStack() {
        top = null;
    }

    // Push operation
    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);
        newFrame.next = top;
        top = newFrame;
        System.out.println(functionName + " called.");
    }

    // Pop operation
    public String pop() {
        if (isEmpty()) {
            System.out.println("No active function to return from.");
            return null;
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    // Peek operation
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return top.functionName;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display call stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Call Stack is Empty.");
            return;
        }

        System.out.println("\nCurrent Call Stack:");
        Frame temp = top;
        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallStack stack = new CallStack();

        while (true) {

            System.out.println("\n===== Function Call Tracker =====");
            System.out.println("1. Function Call (Push)");
            System.out.println("2. Function Return (Pop)");
            System.out.println("3. Current Function (Peek)");
            System.out.println("4. Display Call Stack");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Function Name: ");
                    String name = sc.nextLine();
                    stack.push(name);
                }

                case 2 -> {
                    String returned = stack.pop();
                    if (returned != null) {
                        System.out.println(returned + " returned.");
                    }
                }

                case 3 -> {
                    String current = stack.peek();
                    if (current == null) {
                        System.out.println("No active function.");
                    } else {
                        System.out.println("Currently Executing: " + current);
                    }
                }

                case 4 -> stack.display();

                case 5 -> {
                    System.out.println("Program Ended.");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}