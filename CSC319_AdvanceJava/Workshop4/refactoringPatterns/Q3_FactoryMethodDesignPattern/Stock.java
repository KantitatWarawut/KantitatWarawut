package Q3_FactoryMethodDesignPattern;

public class Stock extends Product {
	public Stock() {
		super("Stock");
	}

	@Override
	public String toString() {
		return "Stock : " + super.toString();
	}
}


