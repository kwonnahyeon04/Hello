
public class Taxi extends Car{ //자식
    int pay = 3000;
    
    void payUp() {
    	pay += 100;
    	System.out.println("현재 요금:" + pay);
    }
    void print() {
    	//Taxi의 print: 이름과 색상 출력 
    	System.out.println("[Taxi]"+ name + color);
    }
}
