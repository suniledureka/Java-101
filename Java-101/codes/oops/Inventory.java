package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		
		prod.setProductId(1001452);
		prod.setProductName("Mobile Phone");
		
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		System.out.println();
		
		System.out.println("prod is an instance of type = " + prod.getClass().getName());
		System.out.println("prod is an instance of type = " + prod.getClass().getSimpleName());
		System.out.println();
		
		System.out.println("hashCode() = " + prod.hashCode());
		System.out.println("hashCode() in hexa decimal form = " + Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod); //toString()
	}

}
