
public class Student6 {


	   private String name;
	   private int number;
	   private int age;
	   
	   public Student6() {}
	   Student6(String name, int number, int age){
	      this.name = name;
	      this.age = age;
	      this.number=number;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getNumber() {
	      return number;
	   }

	   public void setNumber(int number) {
	      this.number = number;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }
	   void toPrint(){
	      System.out.println("이름: "+name+" 학번: "+number+" 나이: "+age);
	   }
	}
