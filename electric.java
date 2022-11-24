import java.util.*;
class electricBill

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the units of consumption ");
  int a=sc.nextInt();
  int b;
  if(a>=1 && a<=1500)
   {
   b=a*10;
   System.out.println("Your bill is Rs"+b);
   }
  else if(a>100 && a<=200)
   {
   b=a*15;
   System.out.println("Your bill is Rs"+b);

   }
  else if(a>200 && a<=300)
   {
   b=a*20;
   System.out.println("Your bill is Rs"+b);

   }
  else if(a>300)
   {
   b=a*25;
   System.out.println("Your bill is Rs"+b);
   }
 
 }
}