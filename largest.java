package number;
import java.util.Scanner;
public class largest {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the m number");
	int m=s.nextInt();
	System.out.println("enter the n number");
	int n=s.nextInt();
	int res=(m>n)?m:n;
	System.out.println("the largest of two number is : "+res );
	
}
}//