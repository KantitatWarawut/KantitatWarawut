public class RunPrintlnFIF {
    public static void main(String[] args) {
        RunPrintlnIF<String> c1 = System.out::println;
        c1.print("C1");

        RunPrintlnIF<String> c2 = (String s) -> {
            System.out.println(s);
        };
        c2.print("C2");

        RunPrintlnIF<String> c3 = s -> System.out.println(s);
        c3.print("C3");
    }
}
