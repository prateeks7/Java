/*Starting with a 1-indexed array of zeros and a list of operations, for each operation 
add a value to each of the array element between two given indices, inclusive. Once all 
operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros n=10. Your list of queries is as follows:

a b k
1 5 3
4 8 7
6 9 1

Add the values of "k" between the indices "a" and "b" inclusive:
index --> 1 2 3 4 5 6 7 8 9 10

[0,0,0,0,0,0,0,0,0,0]
[3,3,3,3,3,0,0,0,0,0]
[3,3,3,10,10,7,7,7,0,0]
[3,3,3,10,10,8,8,8,1,0]

The largest value is 10 after all operations are performed.

Function description

n - no of elements in your array;
queries - an 2d array;
array manipulation return int;
passing n and queries
package array.manipulation;

input format
n and no of operands(rows)
2d array

Example:
5 3
1 2 100
2 5 100
3 4 100



*/
import java.util.Scanner;
public class ArrayManipulation {
   public static int arrayManipulation(int n,int[][] queries)
{
  int[] arr = new int[n];
  int i,k;
  for(i=0;i<n;i++)
  {
    arr[i]=0;
  }
  for(i=0;i<queries.length;i++)
  {
     for(k=queries[i][0]-1;k<=queries[i][1]-1;k++)
      {
        arr[k] = arr[k]+queries[i][2];
      }
  }
  int max=0;
  for(i=0;i<n;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    }
  }
  return max;
   
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[][] queries = new int[q][3];

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j]=sc.nextInt();
            }
        }

        int result = arrayManipulation(n, queries);

        System.out.println(result);
    }
    
}
