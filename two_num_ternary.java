package first_java_programe;
import java.util.Scanner;

public class two_num_ternary {
	public static void print_ternary(int a,int b) {
		System.out.println("Enter any numbers:");
		Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 b=sc.nextInt();
		
		
		String s=(a>b)?"a is greater":"b is greater";
		System.out.println("Result is-->:"+s);
	}
	public static void main(String[] args) {
		print_ternary(1,8);
	}

}
