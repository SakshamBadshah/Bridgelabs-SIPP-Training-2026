public class NestedTry {

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        try {

            try {
                int value = arr[1];

                try {
                    System.out.println(value / 0);

                } catch(ArithmeticException e) {
                    System.out.println(
                    "Cannot divide by zero!");
                }

            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(
                "Invalid array index!");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}