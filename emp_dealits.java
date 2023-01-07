package number;
import java.util.Scanner;
public class emp_dealits {
		static Scanner s=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("enter the emp name");
			char ch=s.next().charAt(1);
			System.out.println("enter the emp age");
			int age=s.nextInt();
			System.out.print("enter the emp sal");
			double sal=s.nextDouble();
			System.out.println("the emp name is:"+ch);
			System.out.println("the emp age is:"+age);
			System.out.println("the emp sal is:"+sal);
		}
	}



