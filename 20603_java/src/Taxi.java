
public class Taxi extends Car{ //�ڽ�
    int pay = 3000;
    
    void payUp() {
    	pay += 100;
    	System.out.println("���� ���:" + pay);
    }
    void print() {
    	//Taxi�� print: �̸��� ���� ��� 
    	System.out.println("[Taxi]"+ name + color);
    }
}