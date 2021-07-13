
public class Phone {
//생성자
	Phone(){
		total++;
	}
	Phone(String company, String model, int price){
		this();
		this.company = company;
		this.model=model;
		this.price=price;
	}
//멤버변수
    String model;
    int price;
    static int total;
    String company;
    
//멤버 메소드
    String toPrint() {
    	//String str = this.price+"만원짜리"+this.model+"스마트 폰";
    	String str = this.company+ " "+ this.model+" "+ this.price+ "만원";
    	return str;
    }
    void printTotal() {
    	System.out.println("현재 총" + total+"개 재고있음.");
    }
    
}
