
public class Truck extends Car{
	
       int ton;
       
       public Truck(String color, String name, int velocity) {
    	  super(color,name,velocity);
    	  ton = 5;
       }
       //Truck�� print: �̸��� �� ���
       void print() {
    	   System.out.println("[Truck]"+ name + ton);
       }
}
