
public class ShoppingMall_Main {

	public static void main(String[] args) {
		ShoppingMall tv= new ShoppingMall("AABB123");
		tv.addToral(10);
		
		ShoppingMall camera = new ShoppingMall("CCDD987");
		camera.addToral(20);
		camera.subTotal(5);
		
		HomeShopping bag = new HomeShopping("BAG8765");
		bag.setTime("12:30");
		bag.addToral(50);
		//BAG8765 ��۽ð��� 12:30 PM�Դϴ�.
		System.out.println();


	}

}
