
public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza1 = new Pizza();
		pizza1.size = 12;
		pizza1.setType("슈퍼스프림");
		
		Pizza pizza2 = new Pizza("포테이토");
		pizza2.setSize(24);
		Pizza pizza3 = new Pizza("불고기", 12);
		
		pizza1.toPrint();
		pizza2.toPrint();
		pizza3.toPrint();
		
	}

}
