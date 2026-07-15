import java.util.Scanner;

public class UndoBuffer {

    @SuppressWarnings("FieldMayBeFinal")
    private String[] data;
    private int top;

    public UndoBuffer(int size) {
        data = new String[size];
        top = -1;
    }

    public boolean push(String edit) {

        if (top == data.length - 1) {
            System.out.println("Undo Buffer Full!");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    public String pop() {

        if (isEmpty()) {
            return "Nothing to Undo";
        }

        return data[top--];
    }

    public String peek() {

        if (isEmpty()) {
            return "Undo Buffer Empty";
        }

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("No Undo History");
            return;
        }

        System.out.println("Undo History:");

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UndoBuffer undo = new UndoBuffer(5);

        while (true) {

            System.out.println("\n1. Record Edit");
            System.out.println("2. Undo");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Edit: ");
                    String edit = sc.nextLine();
                    undo.push(edit);
                }

                case 2 -> System.out.println("Undo: " + undo.pop());

                case 3 -> System.out.println("Latest Edit: " + undo.peek());

                case 4 -> undo.display();

                case 5 -> {
                    System.out.println("Program Ended");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Choice");
            }
        }
    }
}