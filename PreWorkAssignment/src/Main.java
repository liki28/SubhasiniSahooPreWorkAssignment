import java.util.Scanner;

public class Main {
Scanner sc=new Scanner(System.in);
	
	public void checkPalindrome() {
		int n,rev=0,rem;
		System.out.println("Enter a number to check if it is a palindrome\n");
		int value =sc.nextInt();
		n=value;
		while(value!=0) {
			rem=value%10;
			rev=rev*10+rem;
			value=value/10;
		}
		if(n==rev)
			System.out.println(n+"is palindrome");
		else
			System.out.println(n+"is not palindrome");
			
	}
	
	public void printPatten() {
		String pattern="";
		System.out.println("Enter a number to print the pattern.\n");
		int value=sc.nextInt();
		if(value>0) {
			for(int i=value;i>0;i--) {
				for(int j=0;j<i;j++) {
					pattern+="*";
				}
				System.out.println(pattern);
				pattern="";
			}
			System.out.println();
		}else
			System.out.println("Enter valid no.\n");
		
	}
	public void checkprimenumber() {
		System.out.println("Enter a number to check whether it is a prime no.\n");
		int value=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=value/2;i++) {
			if(value%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(value+"is a prime number");
		else
			System.out.println(value+"is not a prime");
		System.out.println();
		
	}
	public void printFibonacciSeries() {
		System.out.println("Enter a number to print the fibonacci series.\n");
		int value=sc.nextInt();
		
		int first=0,second=1,sum=0,i;
		System.out.println("The Fibonacci series elements are\n"+first+" \n"+second);
		for( i=1;i<=value-2;i++) {
			sum=first+second;
			System.out.println(" "+sum);
			first=second;
			second=sum;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n"
		+"1.Find palindrome of number.\n"
					+"2.Print pattern for a given no.\n"
		+"3.Check whether the no. is a prime number.\n"
					+"4.Print Fibonacci series.\n" +"0.Exist.\n");
			System.out.println();
			
			choice=sc.nextInt();
			switch(choice) {
			
			case 0:
				choice=0;
				break;
				
			case 1:{
				obj.checkPalindrome();
			}
				break;
				
			case 2:{
				obj.printPatten();
			}
				break;
				
			case 3:{
				obj.checkprimenumber();
			}
				break;
				
			case 4:{
				obj.printFibonacciSeries();
			}
			break;
			
			default:
				System.out.println("Invalid choice.Enter a valid no.\n");
				
			}
			
		}while(choice!=0);
		System.out.println("Exited Successfully!!!");
		sc.close();
		

	}

}
