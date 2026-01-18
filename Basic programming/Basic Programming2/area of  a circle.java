 import java.util.Scanner;
 class area of a circle{
 public static void main(String[]args){
  double radius,area;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the radius of the circle");
  radius = input.nextDouble();
   
   area = Math.PI*radius*radius;
   System.out.println("Area of circle is "+area);
   }

}