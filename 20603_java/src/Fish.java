
public class Fish extends Animal {

	public static void main(String[] args) {
		
		Fish gold= new Fish();
		gold.name="�ݺؾ�";
		gold.toPrint();
		
		//��ĳ����:���� <---����
		Animal ani = gold;
		ani.toPrint();
	 
		
		//�ٿ�ĳ����:���� <--- ����
		//Fish silver = new Animal(); �Ұ���
		Fish silver = (Fish)ani; //�����
		silver.toPrint();
		
		
		

	}

}
