package number;
import java.util.Scanner;
public class count_ever_odd {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the number");
	int m=s.nextInt();
	System.out.println("Enter the number");
	int n=s.nextInt();
	while(m<n) {
	if(m%2==0)
	{
		System.out.println("it is a even number"+m);
		
	}
	m++;
	}
}
}