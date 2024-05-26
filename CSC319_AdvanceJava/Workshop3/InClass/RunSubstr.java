import java.util.function.BiFunction;

public class RunSubstr {
    public static void main(String[] args) {
        RunSubstrIF sif = (s, i) -> s.substring(i);
        System.out.println(sif.exec("Interface", 2));
        RunSubstrIF sif2 = String::substring;
        System.out.println(sif2.exec("Interface", 2));

        BiFunction<String, Integer, String> sbf = (s, i) -> s.substring(i);
        System.out.println(sbf.apply("Rewrite", 2));
        BiFunction<String, Integer, String> sbf2 = (s, i) -> s.substring(i);
        System.out.println(sbf2.apply("Rewrite", 2));
    }
}

@FunctionalInterface
interface RunSubstrIF {
    public String exec(String s, int i);
}