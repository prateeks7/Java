/*If ‘n’ is the positive number and ‘a’ is an array of integers of length n-1 containing elements from 1 to n. 
Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. i.e ‘a’ does not contain duplicates.

Note: The Range of Array will always start from 1.
Example:
If;n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. 
For example&nbsp;{1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
*/
package missing.nos;
import java.util.Scanner;
public class MissingNos {
    public static int MissingElement(int[] a,int n)
{
  int i,j,flag;
  int b=0;
  for(j=1;j<n;j++)
  {
    flag = 0;
    for(i=0;i<n-1;i++)
    {
      if(j==a[i])
      {
        flag = 1;
      }
    }
    if(flag==0)
    {
       b=j;
    }
  }
  return b;
}
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
int i,n;
n=sc.nextInt();
     int a[]=new int[n];

         for(i=0;i<n-1;i++)
     {
         a[i]=sc.nextInt();
     }
         int missingNumber=MissingElement(a,n);  // receive array and no. of elements as argument .
 System.out.println(missingNumber);
    }
    }
    

