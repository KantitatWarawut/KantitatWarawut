package Q3_FactoryMethodDesignPattern;

public class Main {
	public static void main(String[] args) {
		Product p1 = ProductFactory.createProduct("loan");
		System.out.println(p1);
		
		Product p2 = ProductFactory.createProduct("stock");
		System.out.println(p2);
		
		Product p3 = ProductFactory.createProduct("bond");
		System.out.println(p3);
	}
}
