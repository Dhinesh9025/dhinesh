package number;  
import java.util.*;
public class OTP {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the otp number");
	int res;
	double res=9999*Math.random()+9999;
	
    int din=res;
	System.out.println(din);
	int boo=s.nextInt();
	if(din==boo)
	{
	System.out.println("verfer the otp12");
	}
	else
	{
		System.out.println("error");
	}
}
}
