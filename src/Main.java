public class Main {
    private static void sayHelloManytimes(int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }
    private static void sayHello() {
        System.out.println("==============");
        System.out.println("Hello world!");

    }
    public static void main(String[] args) {
        sayHelloManytimes(7);
    }
}