package number;
import java.util.Scanner;
public class readchar {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the char");
	char ch=s.next().charAt(0);
	if(ch=='a')
		System.out.println( "the enter charaction is "+ch);
    if(ch=='b')
    	System.out.println("the enter charaction is"+ch);
    if(ch=='c')
    	System.out.println("the enter charaction is"+ch);
    if(ch=='d')
    	System.out.println("the enter charaction is"+ch);
    else
    	System.out.println("the enter character range is between E to Z");
}
}

