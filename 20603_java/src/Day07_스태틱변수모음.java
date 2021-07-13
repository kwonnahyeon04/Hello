
public class Day07_스태틱변수모음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student a = new Student();
       a.name = "홍길동";   a.age = 10;
       a.print();
       
       Student b = new Student();
       b.name = "권나현";   b.age = 18;
       b.print();
       
       Student c = new Student("권도현", 22);
       c.print();
       
       //a.school = "서울고";
       a.print();
       b.print();
       b.print(10);
       b.print("권나현");
       
       //프라이빗 멤버 변수 접근
       c.setPhone("010-1234-1234");
       System.out.println();
       
       System.out.println(a.getPhone());
       System.out.println(b.getPhone());
       System.out.println(c.getPhone());
	}

}
