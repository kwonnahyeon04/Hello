//생산자 오버로딩
//스태틱 변수, 메소드
//메소드 오버로딩

public class Cat {
	   //생성자--------------------------------------
	Cat(){
	    count++;
	    System.out.println("test");
  }
    Cat(String name, int age){
    	 this.name = name;
    	 this.age = age;
     
  }
    //맴버변수-----------------------------------------
    String name;
    int age;
    static int count;

    //메소드-------------------------------------------
    void print() {
        System.out.println(name + ":"+ age +"살");
    }
    
    void print(String newName) {
    	this.name = newName;
    	print();
    }
    
    static void printCount() {
    	System.out.println("현재 총 마리수" + count);
    	
    }
}
