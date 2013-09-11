package MeowPackage;
import java.util.Scanner;
public class firstMeow {
	public static void main(String[] args)
	{
		System.out.println("INPUT HOW MUCH MEOW?");
		Scanner scanner = new Scanner(System.in);
		int meow = scanner.nextInt();
		for(int meow2=0;meow2<=meow;meow2++)
		{
			System.out.println("Meow ");
		}
	}
}
