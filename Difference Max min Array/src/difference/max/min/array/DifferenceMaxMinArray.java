package difference.max.min.array;
import java.util.Scanner;
class commonx
{
  int display(int[] array_nums)
  {
    int i,max=0;
    for(i=0;i<array_nums.length;i++)
    {
      if(max<array_nums[i])
      {
        max = array_nums[i];
      }
    }
    int min = array_nums[array_nums.length-1];
    for(i=0;i<array_nums.length;i++)
    {
      if(min>array_nums[i])
      {
        min = array_nums[i];
      }
    }
    return max-min;
  }
}
public class DifferenceMaxMinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] array_nums = new int[n];
    for (int i = 0; i < n; i++)
    	array_nums[i] = sc.nextInt();
  
	  commonx ob=new commonx();
   int b= ob.display(array_nums);  //accept array as input and find min and max element from array and  //calculate difference  
   System.out.println(b);
    }
    
}
