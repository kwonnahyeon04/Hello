import java.util.Scanner;

public class Day03_간단한계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		String op;
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자:");
			a = sc.nextInt();
			if(a == 0){
				System.out.println("bye");
				break;
			}
			System.out.print("숫자:");
			b = sc.nextInt();
			System.out.print("연산자:");
			op = sc.next();
		
		
			if(op.equals("+"))
				System.out.println(a + "+" + b + "=" + (a+b) );
			else if(op.equals("-"))
				System.out.println(a + "-" + b + "=" + (a-b) );
			else if(op.equals("*"))
				System.out.println(a + "*" + b + "=" + (a*b) );
			else if(op.equals("/"))
				System.out.println(a + "/" + b + "=" + (a/b) );
		}
		




	}

}
