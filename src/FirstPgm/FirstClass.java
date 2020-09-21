package FirstPgm;
import java.util.Scanner;
public class FirstClass {

	public static void main(String[] args) {
		
		int rev1 = Rev();
		System.out.println("the reversed number is :" + rev1);
	}

	static int Rev() {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (num!= 0) {
			rev = rev*10;
			rev = rev+num%10;
			num= num/10;
		
		}
		return rev;
	}
}
