/* This is my first Java program */

public class Hello
{
   public static void main (String[] args)
   {
      int x, y, sum, product, difference, remainder, quotient;
      
      x = 10;
      y = 25;
      
      sum = x + y;
      product = x*y;
      difference = y-x;
      remainder = y%x;
      quotient = y/x;
      
      System.out.println(x + " + " + y + " = " + sum);
      System.out.println(x + " x " + y + " = " + product);
      System.out.println(y + " - " + x + " = " + difference);
      System.out.println("The remainder of " + y + " divided by " + x + " is " + remainder);
      System.out.println(y + " divided by " + x + " = " + quotient + " remainder " + remainder);
   }
}