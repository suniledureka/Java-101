package co.edureka.services;

public class TestApp {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		int x = 10;
		int y = 12;
		int z = ref.add(x, y);
		
		System.out.println(x + " + " + y + " = " + z);
	}

}
