import java.util.*;
class discount

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the price to check discount offers");
  float a=sc.nextFloat();
  float b;
  float c;
  if(a<=800)
   {
    System.out.println("Sorry!! no discounts available");
   }
  else if(a>800 && a<=1500)
   {
    System.out.println("Congratulation!! you won 10% discount on the product");
    b=(a*10)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>1500 && a<=2500)
   {
    System.out.println("Congratulation!! you won 15% discount on the product");
    b=(a*15)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>2500 && a<=5000)
   {
    System.out.println("Congratulation!! you won 20% discount on the product");
    b=(a*20)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>5000)
   {
    System.out.println("Congratulation!! you won 30% discount on the product");
    b=(a*30)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
 }
 
 }
}