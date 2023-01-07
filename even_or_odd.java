package number;
import java.util.Scanner;
public class even_or_odd {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the number");
	int m=s.nextInt();
	if(m%2==0)
	{
		System.out.println("it is a even number"+m);
	}
	else
	{
		System.out.println(m+ "it is a odd number ");
	}
}
}
