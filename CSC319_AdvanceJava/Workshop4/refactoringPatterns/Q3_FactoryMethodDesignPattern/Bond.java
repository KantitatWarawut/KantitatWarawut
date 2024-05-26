package Q3_FactoryMethodDesignPattern;

public class Bond extends Product {
	public Bond() {
		super("Bond");
	}

	@Override
	public String toString() {
		return "Bond : " + super.toString();
	}
}


