import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		int command,a,b;
		Scanner sc=new Scanner(System.in);
		command=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		switch(command){
			case 1:
				System.out.println(a+b);
			break;
			case 2:
				System.out.println(a-b);
			break;
			case 3:
				System.out.println(a*b);
			break;
			case 4:
				System.out.println(a/b);
			break;
			default:
				System.out.println("no valid operations");
			}
		}
	}