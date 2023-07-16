
public class ConditionalOperator {

	public static void main(String[] args) {
		//int x = 10;
		int x = 25;
		int y = 15;	
		/*
		int lar;
		
		if(x > y) {
			lar = x;
		}else {
			lar = y;
		}
		*/
		
		int lar = (x > y) ? x : y;
		//the largest of (10, 15) = 15
		System.out.println("the largest of (" + x + ", " + y +") = " + lar);
	}

}
