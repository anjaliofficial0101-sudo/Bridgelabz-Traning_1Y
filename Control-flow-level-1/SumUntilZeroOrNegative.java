 import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int number;
		while(true)
		{
     System.out.print("Enter the numbers to sum (enter 0 or negative number to stop):");
        number=sc.nextInt();
		if ( number<=0)
		{  
		    break;
		}
		sum+=number;
		}
                  System.out.println("sum of positive numbers entered:" +sum);
    }
}