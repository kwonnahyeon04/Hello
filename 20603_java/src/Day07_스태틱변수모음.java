
public class Day07_����ƽ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student a = new Student();
       a.name = "ȫ�浿";   a.age = 10;
       a.print();
       
       Student b = new Student();
       b.name = "�ǳ���";   b.age = 18;
       b.print();
       
       Student c = new Student("�ǵ���", 22);
       c.print();
       
       //a.school = "�����";
       a.print();
       b.print();
       b.print(10);
       b.print("�ǳ���");
       
       //�����̺� ��� ���� ����
       c.setPhone("010-1234-1234");
       System.out.println();
       
       System.out.println(a.getPhone());
       System.out.println(b.getPhone());
       System.out.println(c.getPhone());
	}

}
