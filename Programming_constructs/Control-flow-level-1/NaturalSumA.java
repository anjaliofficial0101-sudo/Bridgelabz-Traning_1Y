import java.util.*;
class NaturalSumA
{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a natural number");
		int num = sc.nextInt();
		if (num<1){
			System.out.println("Not a natural number");
			return; 
		}
		System.out.println("You entered a natural number");
		int sumwhileloop = 0;
		int sumformula = 0;
		sumformula = (num * ( num + 1))/ 2;
		int i = 1;
		while ( i<= num){
			sumwhileloop +=i;
			i++;
		}
		System.out.println("result using formula:"  + sumformula);
		System.out.println("result using whileloop:"  + sumwhileloop);
		if (sumformula==sumwhileloop){
			System.out.println("both results are equal");	
		
		} else {
			System.out.println("both results are not equal");
		}
	}
}