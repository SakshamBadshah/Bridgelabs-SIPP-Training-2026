public class ArrayIndexDemo {

    public static void main(String[] args) {

        String[] names = {"Amar", "Akbar", "Anthony"};

        try {
            System.out.println(names[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        }
    }
}