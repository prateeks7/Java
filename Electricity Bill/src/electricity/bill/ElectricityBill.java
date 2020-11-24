/*An electricity board charges the following rates to demonstrate 
users
to discourage large consumption of energy:
For the first 100 units    -60P per unit
For the next 200 units    -80P per unit
Beyond 300 units   -90P per unit

If the total amount becomes more than Rs, 300.00 then additional
200 P are charged.

*/
package electricity.bill;
import java.util.Scanner;
class Bill
{
  int nos,sum=0;
  Bill(int n)
  {
    nos = n;
  }
  int compute_bill()
  {
    if(nos>0 &&  nos<=100)
    {
      sum = sum+60;
    }
    else if(nos>100 && nos<=300)
    {
      sum = sum + 100*60 + (nos-100)*80; 
    }
    else if(nos>300)
    {
      sum = sum + 100*60 + 200*80 + (nos-300)*90;
    }
    if(sum>30000)
    {
      sum = sum + 200;
    }
    return sum;
  }
}

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              int n;
               n=sc.nextInt();
              Bill b=new Bill(n);
              int amount=   b.compute_bill();
              System.out.println(amount+"P");
    }
    
}
