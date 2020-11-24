package add.binary.nos;
import java.util.*;
public class AddBinaryNos {

    public static void main(String[] args) {
       System.out.print("Enter Binary Digit 1: ");
       Scanner inp = new Scanner(System.in); 
       int a;
       a = inp.nextInt();
       System.out.print("Enter Binary Digit 2: ");
       int b;
       b = inp.nextInt();
       int sum = a+b,t=sum,m,n=0,o,p,net=0,flag=0;
       while(t>0)
       {
           m=t%10;
           n=10*n+m;
           t=t/10;
       }
       while(n>0)
       {
          p=n%10; 
          if(p==2 && flag==1)
          {
              net=net*10+11;
              flag=1;
          }
          else if(p==2 && flag==0)
          {
              net=net*10+10;
              flag=1;
          }
          else if(p==1 && flag==1)
          {
              net=net*10+10;
              flag=1;
          }
          else if(p==1 && flag==0)
          {
              net=net+p;
              flag=0;
          }
          else
          {
              net=net+p;
              flag=0;
          }
          n=n/10;
       }
       
       System.out.println("Sum = "+net);
       
       
    }
    
}
