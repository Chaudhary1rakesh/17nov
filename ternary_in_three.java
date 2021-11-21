package first_java_programe;
import java.util.Scanner;

public class ternary_in_three {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("Largest:"+d);
	}}