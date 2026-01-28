   import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
             System.out.print("Enter a number : ");
	 	int num = sc.nextInt();
		if(num<0)
		{
              System.out.print("Not a factorial number ");
		return;
		}
		long fact = 1;
		int i=1;
		while(i<=num)
		{
		  fact*=i;
		  i++;
		}
        System.out.print("Factorial:"+fact);
	}
}