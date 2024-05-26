package Q1_StrategyDesignPattern;

public class Main {
	public static void main(String[] args) {
		Validator numericValidator = new Validator(s -> s.matches("\\d+"));
		boolean b1 = numericValidator.validate("aaaa"); // Returns false

		Validator lowerCaseValidator = new Validator(s -> s.matches("[a-z]+"));
		boolean b2 = lowerCaseValidator.validate("bbbb"); // Returns true

		System.out.println(b1);
		System.out.println(b2);
	}
}