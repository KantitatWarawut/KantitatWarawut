package Q3_FactoryMethodDesignPattern;

public class Loan extends Product {
	public Loan() {
		super("Loan");
	}

	@Override
	public String toString() {
		return "Loan : " + super.toString();
	}
}


