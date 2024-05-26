import java.util.function.Consumer;

public class RunPrintln {
    public static void main(String[] args) {
        // Method Reference
        Consumer c1 = System.out::println;
        c1.accept("C1");
        
        // Block-style Lambda with generic type
        Consumer<String> c2 = (String s) -> {
            System.out.println(s);
        };
        c2.accept("C2");

        // Expression-style Lambda with implied String type
        Consumer<String> c3 = s -> System.out.println(s);
        c3.accept("C3");
    }
}