import java.util.Scanner;
// Complete the class below as sopecified above.
class ReverseGreet extends Thread
{
   public void run()
   {
     ReverseGreet a1 = new ReverseGreet();
     System.out.print("CodeQuotient ");
     System.out.print(a1.getPriority());

   }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ReverseGreet a1 = new ReverseGreet();
    a1.start();
  }
}