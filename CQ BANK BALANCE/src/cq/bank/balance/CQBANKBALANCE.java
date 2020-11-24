package cq.bank.balance;
import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class BankAccount 
{
  int number, balance;
  public BankAccount(int number, int bal) 
  {
    this.number = number;
    this.balance = bal;
  }
  public void withdraw(int amt)      
  {
    this.balance -= amt;
  }
  public void deposit(int amt)     
  {
    this.balance += amt;
  }
  public int getBalance()
  {
    return this.balance;
  }
}
class MinMaxAccount extends BankAccount 
{  
    int minn,max=0;
    public MinMaxAccount(int noss,int ball)
    {
       super(noss,ball);
       minn = ball;
       
    }
   int getMin()
   { 
       if(this.balance < minn)
       {
           minn = this.balance;
       }
       return minn;
   }
   int getMax()
   {
       if(max < this.balance)
       {
         max = this.balance;  
       }
       return max;
   }
   
}
public class CQBANKBALANCE {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      MinMaxAccount a=new MinMaxAccount(s.nextInt(), s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      System.out.println(a.getMin());
      System.out.println(a.getMax());
    }
}
    

