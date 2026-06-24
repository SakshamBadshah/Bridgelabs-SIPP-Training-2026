public class PropagationDemo {

    static void method1() {
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();

        } catch(Exception e) {
            System.out.println(
            "Handled exception in main");
        }
    }
}